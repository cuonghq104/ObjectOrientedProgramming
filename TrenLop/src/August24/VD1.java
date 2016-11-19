/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August24;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */

/**
 * .charAt()
 * .indexOf();
 * .substring(1,3)
 * .toUpperCase()
 * .replace('a', 'b');
 */

/**
 * So sánh xâu :
 * .equals(str)
 * .equalsIsIgnoreCase(str)
 */

/**
 * Ép kiểu:
 * Integer.parseInt();
 * Character.parseteChar();
 * Double.parseDouble();
 * Float.parseFloat();
 * 
 */

/**
 * Đọc xâu:
 * sc.next();
 * sc.nextLine();
 * while(sc.hasNext()) // có xâu tiếp theo
 */

/**
 * Bộ đệm : StringBuilder();
 * 
 * append() : Thêm cuối xâu;
 * delete() : Xóa một đoạn trong xâu;
 */

public class VD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb.toString());
    }
    
}
