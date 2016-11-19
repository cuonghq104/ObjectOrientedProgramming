/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai02;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class MonHoc {
    private int id;
    
    private String name;
    
    private int numberOfLectures;
    
    private int type;
    
    private static int autoID = 100;

    public MonHoc() {
        
    }
    
    public void nhap(Scanner scanner) {
        System.out.print("Ten : ");
        name = scanner.nextLine();
        System.out.print("So tiet hoc : ");
        numberOfLectures = Integer.parseInt(scanner.nextLine());
        System.out.print("Loai : ");
        type = Integer.parseInt(scanner.nextLine());
        id = autoID;
        autoID++;
    }
    
    public void in() {
        System.out.printf("%5d%15s%5d%5d\n", id, name, numberOfLectures,type);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public boolean matchID(int id) {
        return (id == this.id);
    }
}
