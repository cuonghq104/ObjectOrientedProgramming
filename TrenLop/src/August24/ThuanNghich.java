/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August24;

/**
 *
 * @author Cuong
 */
public class ThuanNghich {
    public static void main(String[] args) {
        int counter = 0;
        for( int i = 1000000; i <= 9999999; i++) {
            if(thuanNghich(i)) {
                System.out.print(i + "\t");
                counter++;
            }
            if( counter == 8) {
                System.out.println("");
                counter = 0;
            }
        }
    }
    
    public static boolean thuanNghich( int i) {
        String s = Integer.toString(i);
        StringBuffer sb = new StringBuffer(s).reverse();
        if( s.equals(sb.toString())) {
            return true;
        }
        return false;
    }
    
}
