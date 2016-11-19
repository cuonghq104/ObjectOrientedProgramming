/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Random;
import java.util.function.Predicate;

/**
 *
 * @author Cuong
 */
public class Bai12 {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random r = new Random();
        
        // add new elements to queue 
        for (int i = 0; i < 20; i++) {
            queue.add(r.nextInt(89) + 10);
        }
        System.out.println(queue.toString());
        
        // Print top elements of queue
        try {
            System.out.println("Đỉnh : " + queue.element());
        } catch (NoSuchElementException  e) {
            System.out.println("Queue empty");
        }
        
        // Remove top
        System.out.println("Xóa đỉnh");
        queue.remove();
        System.out.println(queue.toString());
        
        // Remove element
        System.out.println("Xóa số 33 ra khỏi queue");
        queue.remove(33);
        System.out.println(queue.toString());
        
        // Remove if
        System.out.println("Xóa các số nhỏ hơn 50");
        queue.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                if (t < 50) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(queue.toString());
        
        // Contains
        System.out.print("Kiểm tra có số 66 không : ");
        System.out.println(queue.contains(66));
        
        
        
    }
}
