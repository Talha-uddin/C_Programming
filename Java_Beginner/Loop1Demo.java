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
public class Loop1Demo {
    public static void main(String[] args) {
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter intial Number: ");
        m = input.nextInt();
        System.out.print("Enter Final Number: ");
        n = input.nextInt();
        
        int sum = 0;
        
        for(int i=m; i<=n; i++){
            if(i%2 == 0){
                sum = sum+i;
            System.out.println(" "+1);
            }
        }
        System.out.println();
        System.out.println("The sum is: "+sum);
    }
}
