/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.*;

/**
 *
 * @author
 */
public class Bai13 {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(comparator);
        Random r = new Random();

        // Add some new values to priorityQueue
        
        for (int i = 0; i < 5; i++) {
            int n = r.nextInt(89) + 10;
            System.out.println("Add " + n + " to priority queue ");
            priorityQueue.add(n);
        }

        // Print & remove all value of priority queue
        
        System.out.println("-----------------------------");
        System.out.print("Queue : ");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.remove() + " ");
        }
        System.out.println();
        
        // Size
        
        System.out.println("-----------------------------");
        for (int i = 0; i < 8; i++) {
            int n = r.nextInt(89) + 10;
            System.out.println("Add " + n + " to priority queue ");
            priorityQueue.add(n);
        }

        System.out.println("Queue size : " + priorityQueue.size());

        // Contain
        
        System.out.println("-----------------------------");
        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(89) + 10;
            System.out.print("Xét giá trị " + n + " : ");
            if (priorityQueue.contains(n)) {
                System.out.println(n + " có trong queue");
            } else {
                System.out.println(n + " không có trong queue");
            }
        }
        
    }
}


// 
