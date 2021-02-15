/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        
        System.out.println("Enter the last number: ");
        n = input.nextInt();
        
        for(int i=1; i<=n; i= i+1){
            System.out.print(i+"X"+i+" ");
            sum = sum + i*i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
