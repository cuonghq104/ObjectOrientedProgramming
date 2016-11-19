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
public class MaTran {
    
    public int row;
    public int column;
    public int [][]a;
    
    public MaTran() {
        a = new int[20][20];
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số hàng : ");
        row = sc.nextInt();
        System.out.print("Số cột  : ");
        column = sc.nextInt();
        System.out.println("Nhập ma trận : ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public void in() {
        for( int i = 0; i < row; i++) {
            for( int j = 0; j < column; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
