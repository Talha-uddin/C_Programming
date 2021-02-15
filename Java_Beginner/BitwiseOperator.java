/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava;

/**
 *
 * @author DELL
 */
public class BitwiseOperator {
    public static void main(String[] args) {
        int a= 32;
        int b = 12;
        int c;
        /*c = a&b;
        System.out.println("a & b = "+c);
        
        c = a|b;
        System.out.println("a | b = "+c);
        
        c = a^b;
        System.out.println("a ^ b = "+c);*/
        c = a>>3;
        System.out.println("a>>3 = "+c);
        c = a<<3;
        System.out.println("a<<3 = "+c);
    }
}
