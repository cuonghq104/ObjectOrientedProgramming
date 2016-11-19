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
public class Bai17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kích thước ma trận : ");
        int n = sc.nextInt();
        MaTran mt = matrixSpiral(n);
        System.out.println("MA TRẬN xoáy ốc kích thước " + n + " x " + n + ": ");
        mt.in();
    }

    public static MaTran matrixSpiral(int n) {
        MaTran mt = new MaTran();
        mt.column = n;
        mt.row = n;
        int counter = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (counter <= n * n) {
            for( int i = left; i <= right; i++) {
                mt.a[top][i] = counter++;
            }
            top++;
            for( int i = top; i <= bottom; i++) {
                mt.a[i][right] = counter++;
            }
            right--;
            for(int i = right; i >= left; i--) {
                mt.a[bottom][i] = counter++;
            }
            bottom--;
            for(int i = bottom; i >= top; i--) {
                mt.a[i][left] = counter++;
            }
            left++;
        }
        return mt;
    }
}
