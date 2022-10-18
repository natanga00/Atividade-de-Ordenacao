/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

import java.util.Random;

public class Ordenacao {

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
        
        
        //Insertion Sort para o de 20 elementos
        int key, j;
        for (int i = 1; i < array1.length; i++) {
            key = array1[i];
            j = i - 1;

            while (j >= 0 && array1[j] > key) {
                array1[j + 1] = array1[j];
                j = j - 1;
            }
            array1[j + 1] = key;
        }
        System.out.println("20 elementos");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        
        
        //Insertion Sort para o de 20  elementos
        int key2, j2;
        for (int i = 1; i < array2.length; i++) {
            key2 = array2[i];
            j2 = i - 1;

            while (j2 >= 0 && array2[j2] > key2) {
                array2[j2 + 1] = array2[j2];
                j2 = j2 - 1;
            }
            array2[j2 + 1] = key2;
        }
        System.out.println("20 mil");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }               
    }
}
