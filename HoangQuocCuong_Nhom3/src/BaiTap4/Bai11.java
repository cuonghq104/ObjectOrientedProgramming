/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Cuong
 */
public class Bai11 {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Random r = new Random();

        // Add, get, size
        for (int i = 0; i < 20; i++) {
            vector.add(r.nextInt(90) + 10);
        }

        for (int i = 0; i < 3; i++) {
            vector.add(r.nextInt(vector.size()), r.nextInt(90) + 10);
        }

        System.out.println("Vector : ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.printf("%4d", vector.get(i));
        }
        System.out.println();

        System.out.println("------------------------------------");

        // Contain
        for (int i = 0; i < 5; i++) {
            int n = r.nextInt(90) + 10;
            System.out.print(n + " trong vector : ");
            if (vector.contains(n)) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
        System.out.println("------------------------------------");

        // Remove
        for (int i = 0; i < 5; i++) {
            int n = r.nextInt(vector.size());
            vector.remove(n);
            System.out.println("Xóa phần tử thứ " + n);
            System.out.println("Vector : ");
            for (int j = 0; j < vector.size(); j++) {
                System.out.printf("%4d", vector.get(j));
            }
            System.out.println();
        }
        System.out.println("------------------------------------");

        // Replace
        for (int i = 0; i < 5; i++) {
            int p = r.nextInt(vector.size());
            int n = r.nextInt(90) + 10;

            vector.set(p, n);
            System.out.println("Thay phần tử thứ " + p + " thành " + n);
            System.out.println("Vector : ");
            for (int j = 0; j < vector.size(); j++) {
                System.out.printf("%4d", vector.get(j));
            }
            System.out.println();
        }
        
        System.out.println("------------------------------------");
        // Sort
        System.out.println("Sort");
        Collections.sort(vector, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int j = 0; j < vector.size(); j++) {
            System.out.printf("%4d", vector.get(j));
        }
        System.out.println();
        System.out.println("------------------------------------");
        
    }
}
