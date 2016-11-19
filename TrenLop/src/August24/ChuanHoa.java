/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August24;

import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author Cuong
 */
public class ChuanHoa {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(sb.toString());
        while(st.hasMoreTokens()) {
            String t= st.nextToken();
            sb.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++)
                sb.append(Character.toUpperCase(t.charAt(i)));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
//        return sb.toString();
    }
}
