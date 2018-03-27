/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod8;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnalmod8 {
public static long fibbonaci(int n){
    if(n==0) 
        return 0;
    else if (n<=2)
        return 1;
    else 
        return fibbonaci(n-1)+fibbonaci(n-2);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner next = new Scanner(System.in);
        System.out.println("masukkan angka :");
        int n = next.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibbonaci(i)+ " ");
            
        }
        System.out.println("");
    }
    
}
