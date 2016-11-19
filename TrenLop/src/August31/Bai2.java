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
public class Bai2 {

    public static void sapXep(ViDu vd[], int n) {
        for (int i = 1; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (vd[i].getTen().compareTo(vd[j].getTen()) > 0) {
                    ViDu temp = vd[i];
                    vd[i] = vd[j];
                    vd[j] = temp;
                }
            }
        }
        System.out.println("Sắp xếp: ");
        for (int i = 1; i < 4; i++) {
            vd[i].in();
        }
    }

    @Override
    public String toString() {

        return "sss";
    }

    public static void main(String[] args) {
        ViDu[] vd = new ViDu[10];
        for (int i = 1; i < 4; i++) {
            System.out.println("[" + i + "]");
            vd[i] = new ViDu();
            vd[i].nhap();
        }

        for (int i = 1; i < 4; i++) {
            vd[i].in();
        }
        sapXep(vd, 4);
        System.out.println("Sắp xếp: ");
        for (int i = 1; i < 4; i++) {
            vd[i].in();
        }
    }
}
