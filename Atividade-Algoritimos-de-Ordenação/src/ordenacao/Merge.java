/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;
import java.util.Random;

public class Merge {

    public static void main(String[] args) { 
                Random gerador = new Random();
        int[] array1 = new int[20];
        int[] array2 = new int[20000];

        //Prenchendo o array de 20 elementos
        for (int i = 0; i < array1.length; i++) {
            array1[i] = gerador.nextInt(300);
        }

        //Preenchendo o array de 20 mil elementos
        for (int i = 0; i < array2.length; i++) {
            array2[i] = gerador.nextInt(300);
        }    
        
        
        mergeSort(array1, array1.length);
        mergeSort(array2, array2.length);
        
        System.out.println("20 elementos");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("20 mil");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        
    }
    
    
public static void merge(
  int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
    
public static void mergeSort(int[] a, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);

    merge(a, l, r, mid, n - mid);
}
    
}
