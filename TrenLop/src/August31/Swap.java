/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August31;

/**
 *
 * @author Cuong
 */
public class Swap {
    
    public static int swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
        return b;
    }
    
    public static void main(String[] args) {
        int a = 7, b = 11;
        System.out.println("Trước khi đổi : " + a + " " + b);
        swap(b, b = swap(a, b));
        System.out.println("Sau khi đổi : " + a + " " + b);
    }
    
}
