/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class Bai08 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        
        // Add new elements
        al.add("Hello");
        al.add("World");
        al.add("and");
        al.add("Every");
        al.add("Body");
        
        // Print elements
        
        System.out.print("Danh sách các phần tử : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        
        // Search
        System.out.println("-----------------------");
        System.out.println("Tìm kiếm");
        String sample = "Test";
        if (al.contains(sample)) {
            System.out.println(sample + " có trong ArratList");
        } else {
            System.out.println(sample + " không có trong ArrayList");
        }
        
        // Replace
        System.out.println("-----------------------");
        System.out.println("Thay thế phần tử trong ArrayList");
        al.set(3, "Replace");
        System.out.print("Danh sách các phần tử : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        // Size
        System.out.println("-----------------------");
        System.out.println("Kích thước : " + al.size());
        
        // Sort
        System.out.println("-----------------------");
        System.out.println("Sắp xếp lại ArrayList");
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.print("Danh sách các phần tử : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        
        // Delete elements
        System.out.println("-----------------------");
        System.out.println("Xóa phần tử ra khỏi ArrayList");
        al.remove("Hello");
        System.out.println("Hello bị xóa khỏi ArrayList");
        System.out.print("Danh sách các phần tử : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
    }
}
