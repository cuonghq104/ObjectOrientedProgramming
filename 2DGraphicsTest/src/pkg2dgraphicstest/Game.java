/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dgraphicstest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg2dgraphicstest.gfx.ImageLoader;

/**
 *
 * @author Cuong
 */
public class Game implements Runnable {

    private Display display;

    private Thread thread;

    private boolean running = false;

    private BufferStrategy bs;

    private Graphics g;

    
    private BufferedImage bf;
    
    public Game(String title, int width, int height) {
        display = new Display(title, width, height);
        bf = ImageLoader.loadImage("/textures/TruongLieu.png");

    }

    public synchronized void start() {
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        try {
            Thread.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int red = 10;
    private int blue = 20;
    private int green = 30;

    private int posX = 0;
    private int posY = 0;
    private int top = 0;
    private int bottom = 270;
    private int left = 0;
    private int right = 270;

    private int size = 20;

    public void nextPosition() {
        if(posX == posY && posY == 130) {
//            running = false;
            return;
        }
        if (posX == left && posY == top + size) {
//            posY += 60;
            posX += size;
            top += size;
            bottom -= size;
            left += size;
            right -= size;
            return;
        }
        
        if (posX != right && posY == top) {
            posX += size;
        }
        if (posX == right && posY == top) {
            posX -= size;
            posY += size;
            return;
        }
        if (posX == right - size && posY != bottom && posY != top) {
            posY += size;
        }
        if (posX == right - size && posY == bottom) {
            posX -= size;
            posY -= size;
            return;
        }
        if (posY == bottom - size && posX != left && posX != right - size) {
            posX -= size;
            return;
        }
        if (posY == bottom - size && posX == left - size) {
            posX += size;
            posY -= size;
        }
        if (posX == left && posY != top - size) {
            posY -= size;
            return;
        }
    }

    public void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        // draw
        g = bs.getDrawGraphics();
//        g.clearRect(0, 0, 600, 600);
//        g.drawImage(bf.getScaledInstance(300, 300, 300), 0, 0, null);
        Color c = new Color(red, green, blue);

        g.setColor(c);
        g.fillOval(posX, posY, size, size);

        // Translate into new position
        nextPosition();
        System.out.println(posX + " " + posY);
        Random r = new Random();
        // Change the diffirent color
        red = r.nextInt(200);
        green = r.nextInt(200);
        blue = r.nextInt(200);
//         end drawing        
        bs.show();
        g.dispose();
        if(posX == posY && posY == 130) {
            running = false;
        }
        
    }

    public void init() {
        while (running) {
            update();
            render();
        }
    }
    
    public void run() {
        init();
    }
}
