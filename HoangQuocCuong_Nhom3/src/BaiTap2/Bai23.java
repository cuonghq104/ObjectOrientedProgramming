/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        System.out.print("A = ");
        a = sc.next();
        System.out.print("B = ");
        b = sc.next();
        String tong = new String();
        if (a.length() > b.length()) {
            tong = cong(a, b);
        } else {
            tong = cong(b, a);
        }
        System.out.println("A + B = " + tong);
        String hieu = tru(a, b);
        System.out.println("A - B = " + hieu);
        String tich = nhan(a, b);
        System.out.println("A * B = " + tich);
    }

    public static String cong(String a, String b) {
        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        StringBuilder kq = new StringBuilder();

        int la = a.length();
        int lb = b.length();
        sba.reverse();
        sbb.reverse();
        for (int i = 0; i < la - lb; i++) {
            sbb.append('0');
        }
        int remember = 0;
        for (int i = 0; i < la; i++) {
            int result = (sba.charAt(i) - '0') + (sbb.charAt(i) - '0') + remember;
            remember = result / 10;
            kq.append(result % 10);
        }
        if (remember == 1) {
            kq.append('1');
        }
        kq.reverse();
        return kq.toString();
    }

    public static String tru(String a, String b) {
        if (a.compareTo(b) == 0) {
            return "0";
        }
        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        StringBuilder kq = new StringBuilder();

        int la = a.length();
        int lb = b.length();
        sba.reverse();
        sbb.reverse();

        boolean negativeNumber = false;

        int ia = Integer.parseInt(a);
        int ib = Integer.parseInt(b);

        if (ia < ib) {
            negativeNumber = true;
            StringBuilder tmp = sba;
            sba = sbb;
            sbb = tmp;
        }

        int chenhLech = sba.toString().length() - sbb.toString().length();

        if (chenhLech > 0) {
            for (int i = 0; i < chenhLech; i++) {
                sbb.append('0');
            }
        }

        int borrow = 0;
        for (int i = 0; i < sba.length(); i++) {
            int result = 0;
            if (sba.charAt(i) < sbb.charAt(i)) {
                result = sba.charAt(i) - sbb.charAt(i) + 10 - borrow;
                borrow = 1;
            } else {
                result = sba.charAt(i) - sbb.charAt(i) - borrow;
                borrow = 0;
            }
            kq.append(result);
        }
        while (kq.charAt(kq.length() - 1) == '0') {
            kq.deleteCharAt(kq.length() - 1);
        }
        if (negativeNumber) {
            kq.append('-');
        }
        kq.reverse();
        return kq.toString();
    }

    public static String nhan(String a, String b) {
        if(a.compareTo(b) == 0 && a == "0") {
            return "0";
        }
        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        sba.reverse();
        sbb.reverse();

        StringBuilder fullResult = new StringBuilder("0");
        int remember = 0;
        for (int i = 0; i < b.length(); i++) {
            StringBuilder partlyResult = new StringBuilder();
            int s = sbb.charAt(i) - '0';
            for (int j = 0; j < a.length(); j++) {
                int tmp = s * (sba.charAt(j) - '0') + remember;
                remember = tmp / 10;
                partlyResult.append(tmp % 10);
            }
            if (remember != 0) {
                partlyResult.append(remember);
            }
            for(int j = 0; j < i; j++) {
                partlyResult.insert(0, '0');
            }
            
            StringBuilder tf = fullResult;
            StringBuilder tp = partlyResult;
            tf.reverse();
            tp.reverse();
            String tmp = new String();
            if(Integer.parseInt(tf.toString()) > Integer.parseInt(tp.toString())) {
                tmp = cong(fullResult.toString(), partlyResult.toString());
            } else {
                tmp = cong(partlyResult.toString(), fullResult.toString());
            }
            fullResult = new StringBuilder(tmp);
            fullResult.reverse();
        }
        if(remember != 0) {
            fullResult.append(remember);
        }
        fullResult.reverse();
        return fullResult.toString();
    }

}
