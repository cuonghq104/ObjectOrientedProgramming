/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.Comparator;
import java.util.Stack;

/**
 *
 * @author Cuong
 */
public class Bai10 {

    public static void in(Stack stack) {
        System.out.print("Stack : ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.printf("%4d", stack.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        
        // Khởi tạo
        stack.add(12);
        stack.add(23);
        stack.add(34);
        stack.add(48);
        stack.add(86);
        stack.add(63);
        in(stack);
        System.out.println("---------------------------------------");

        // Đầu và cuối của stack
        System.out.println("Đầu : " + stack.firstElement());
        System.out.println("Cuối : " + stack.lastElement());

        System.out.println("---------------------------------------");

        // Sắp xếp linked list
        stack.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Stack được sắp xếp : ");
        in(stack);
        System.out.println("---------------------------------------");

        // In ra đỉnh của stack
        System.out.println("Đỉnh : " + stack.peek());
        in(stack);
        System.out.println("---------------------------------------");
        
        // Xóa đỉnh của stack;
        stack.pop();
        System.out.println("Đã xóa đỉnh của stack");
        in(stack);
        System.out.println("---------------------------------------");

    }
}
