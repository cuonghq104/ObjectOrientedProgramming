/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class MaTrix {

    private float a[][];

    public MaTrix() {
        a = new float[3][3];
    }

    public MaTrix(int rows, int cols) {
        a = new float[rows][cols];
    }

    public MaTrix add(MaTrix m) {
        if (this.a.length != m.a.length || this.a[0].length != m.a[0].length) {
            return null;
        }
        MaTrix s = new MaTrix(m.a.length, m.a[0].length);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[i].length; j++) {
                s.a[i][j] = this.a[i][j] + m.a[i][j];
            }
        }
        return s;
    }

    public MaTrix sub(MaTrix m) {
        if (this.a.length != m.a.length || this.a[0].length != m.a[0].length) {
            return null;
        }
        MaTrix s = new MaTrix(m.a.length, m.a[0].length);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[i].length; j++) {
                s.a[i][j] = this.a[i][j] - m.a[i][j];
            }
        }
        return s;
    }

    public MaTrix neg(MaTrix m) {
        MaTrix s = new MaTrix(m.a.length, m.a[0].length);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[i].length; j++) {
                s.a[i][j] = -m.a[i][j];
            }
        }
        return s;
    }

    public MaTrix transpose() {
        MaTrix s = new MaTrix(a[0].length, a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                s.a[j][i] = a[i][j];
            }
        }
        return s;
    }

    public MaTrix mul(MaTrix m) {
        if (this.a[0].length != m.a.length) {
            return null;
        }
        MaTrix x = new MaTrix(a.length, m.a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                int s = 0;
                for (int k = 0; k < a[0].length; k++) {
                    s += (a[i][k] * m.a[k][j]);
                }
                x.a[i][j] = s;
            }
        }
        return x;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextFloat();
            }
        }
    }

    public void print() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%10f", a[i][j]);
            }
            System.out.println();
        }
    }
}
