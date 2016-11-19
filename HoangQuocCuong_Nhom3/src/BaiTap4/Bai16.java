/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Cuong
 */
public class Bai16 {

    public static void print(HashMap hashmap) {
        // In tất cả các cặp key - object có trong hashmap
        System.out.println("Danh sách các cặp key - objects : ");
        Collection key = hashmap.keySet();
        Collection obj = hashmap.values();

        Iterator ite_key = key.iterator();
        Iterator ite_obj = obj.iterator();

        while (ite_key.hasNext()) {
            System.out.print(ite_key.next() + " - ");
            System.out.println(ite_obj.next());
        }
    }
    public static void main(String[] args) {
        int stt = 0;
        HashMap<Integer, String> hashmap = new HashMap<>();
        Random r = new Random();

        // Thêm cặp key - object vào trong hashmap
        hashmap.put(r.nextInt(89) + 10, "Dell");
        hashmap.put(r.nextInt(89) + 10, "Asus");
        hashmap.put(r.nextInt(89) + 10, "Apple");
        hashmap.put(r.nextInt(89) + 10, "Sony");
        hashmap.put(r.nextInt(89) + 10, "Nokia");
        hashmap.put(r.nextInt(89) + 10, "Samsung");
        hashmap.put(r.nextInt(89) + 10, "LG");
        hashmap.put(r.nextInt(89) + 10, "Xiaomi");
        hashmap.put(r.nextInt(89) + 10, "Nexus");

        
        print(hashmap);
        
        // In ra object dựa vào key
        
        System.out.println();
        System.out.println("Tìm kiếm object dựa vào key : ");
        for (int i = 0; i < 10; i++) {
            int f = r.nextInt(89) + 10;

            System.out.print("Tìm kiếm object có key là " + f + " : ");
            if (hashmap.get(f) == null) {
                System.out.println("Không thấy");
            } else {
                System.out.println(hashmap.get(f));
            }
        }
        
        // Xóa object dựa vào key
        
        System.out.println();
        System.out.println("Xóa object dựa vào key : ");
        for (int i = 0; i < 10; i++) {
            int f = r.nextInt(89) + 10;

            System.out.print("Tìm kiếm object có key là " + f + " : ");
            if (hashmap.get(f) == null) {
                System.out.println("Không thấy");
            } else {
                hashmap.remove(f);
                System.out.println("Đã xóa");
            }
        }
        System.out.println();
        print(hashmap);
        
    }
}
