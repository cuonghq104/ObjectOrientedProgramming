/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Cuong
 */
public class Bai09 {

    public static void in(LinkedList list) {
        System.out.println("Linked list : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%5d", list.get(i));
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Add new elements in the end of the list
        System.out.println("Khởi tạo : ");
        list.add(5);
        list.add(4);
        list.add(68);
        list.add(153);
        list.add(100);
        list.add(111);
        list.add(1000);
        in(list);
        System.out.println("------------------------------------");

        // Add new elements at the beginning of the list
        System.out.println("Thêm đầu");
        list.addFirst(12);
        list.addFirst(15);
        list.addFirst(5);
        in(list);
        System.out.println("------------------------------------");

        // Add new elements at the specify position in the list
        System.out.println("Thêm vào vị trí cụ thể");
        list.add(2, 8);
        list.add(5, 47);
        list.add(7, 69);
        in(list);
        System.out.println("------------------------------------");

        // Print peek first and peek last of the list
        System.out.println("First : " + list.peekFirst());
        System.out.println("Last  : " + list.peekLast());
        System.out.println();
        System.out.println("------------------------------------");

        // Remove
        System.out.println("Xóa");
        list.remove();
        System.out.println("Xóa vị trí đầu : ");
        in(list);

        list.removeLast();
        System.out.println("Xóa vị trí cuối : ");
        in(list);
        System.out.println();
        System.out.println("------------------------------------");
        
        // Sort
        System.out.println("Sắp xếp lại Linked list : ");
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        in(list);

    }
}
