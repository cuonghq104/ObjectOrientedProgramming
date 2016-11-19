/*
 * Merge sort
 */
package BaiTap4;

import java.util.*;
import java.io.*;

/**
 *
 * @author Cuong
 */

public class Bai05 {
    
    public static int step = 1;
    
    public static void merge(int left, int right, int a[], int size, PrintWriter pw) {
        int middle = (left + right) / 2;
        if (left < right) {
            merge(left, middle, a, size, pw);
            merge(middle + 1, right, a, size, pw);
            sort(left, right, middle, a, size, pw);
            DaySo.in(a, size, step, pw);
            step++;
        }
    }
    public static void sort(int left, int right, int middle, int a[], int size, PrintWriter pw) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;
        
        int[] leftArray = new int[100];
        int[] rightArray = new int[100];
        
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = a[left + i];
        }
        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = a[middle + i + 1];
        }
        
        int ileft = 0, iright = 0;
        int i = left;
        
        while (ileft < leftSize && iright < rightSize) {
            if (leftArray[ileft] > rightArray[iright]) {
                a[i] = rightArray[iright];
                i++;
                iright++;
            }
            if (rightArray[iright] >= leftArray[ileft]) {
                a[i] = leftArray[ileft];
                i++;
                ileft++;
            }
        }
        
        while( ileft < leftSize) {
		a[i] = leftArray[ileft];
                i++;
                ileft++;
	}
	while( iright < rightSize) {
		a[i] = rightArray[iright];
                i++;
                iright++;
	}
    }
    public static void main(String[] args) {
        Scanner sc = null;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("MERGESORT.OUT"));
            sc = new Scanner(new File("DAYSO.TXT"));
            
            int size = sc.nextInt();
            int[] a = new int[size];
            
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
                      
            merge(0, size - 1, a, size, pw);

        } catch (FileNotFoundException ex) {
            pw.println("FILE NOT FOUND");
        } finally {
            pw.close();
        }
    }
}
