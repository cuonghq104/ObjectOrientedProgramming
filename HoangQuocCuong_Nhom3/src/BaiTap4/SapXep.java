///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package BaiTap4;
//
//import java.io.PrintWriter;
//
///**
// *
// * @author Cuong
// */
//public class SapXep {
//
//    public static int[] selection_sort(int a[], int size, PrintWriter pw) {
//        for (int i = 0; i < size; i++) {
//            int max = a[i];
//            int maxLocate = i;
//            for (int j = i + 1; j <= a[0]; j++) {
//                if (a[j] > max) {
//                    max = a[j];
//                    maxLocate = j;
//                }
//            }
//            if (maxLocate != i) {
//                int tmp = a[i];
//                a[i] = a[maxLocate];
//                a[maxLocate] = tmp;
//            }
//            pw.print("Step " + i + " : ");
//            ArrayInteger.in(pw, a);
//        }
//        return a;
//    }
//
//    public static int[] bubbleSort(int a[], PrintWriter pw) {
//        int step = 1;
//        pw.print("Step 0 : ");
//        ArrayInteger.in(pw, a);
//        pw.println("\n\n");
//        for (int i = 1; i <= a[0]; i++) {
//            for (int j = i + 1; j <= a[0]; j++) {
//                if (a[i] < a[j]) {
//                    int tmp = a[i];
//                    a[i] = a[j];
//                    a[j] = tmp;
//                }
//                pw.print("Step " + step + " ( i =  " + i + ", j = " + j + ") : ");
//                ArrayInteger.in(pw, a);
//                step++;
//            }
//        }
//        return a;
//    }
//
//    public static int[] insertionSort(int a[], PrintWriter pw) {
//        int step = 1;
//        for (int j = 2; j <= a[0]; j++) {
//            int i = j;
//            while (a[i] > a[i - 1] && i != 1) {
//                int tmp = a[i];
//                a[i] = a[i - 1];
//                a[i - 1] = tmp;
//                i--;
//                pw.print("Step " + step + " : ");
//                ArrayInteger.in(pw, a);
//                step++;
//            }
//        }
//        return a;
//    }
//    
//}
