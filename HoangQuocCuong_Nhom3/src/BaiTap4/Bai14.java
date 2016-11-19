/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Cuong
 */
public class Bai14 {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            sortedSet.add(r.nextInt(20) + 10);
        }
        System.out.println(sortedSet.toString());
        
        // First and last elements of SortedSet
        System.out.println("Đầu  : " + sortedSet.first());
        System.out.println("Cuối : " + sortedSet.last());
        
        // 
        System.out.print("SortedSet nhỏ hơn 20 : ");
        System.out.println(sortedSet.headSet(20).toString());
        
        System.out.print("SortedSet lớn hơn 20 : ");
        System.out.println(sortedSet.tailSet(20).toString());
    }
}
