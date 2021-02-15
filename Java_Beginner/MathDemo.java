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
public class MathDemo {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int max,min,absolute;
        max = Math.max(x, y);
        System.out.println("Maximum: "+max);
        min = Math.min(x, y);
        System.out.println("Minimum: "+min);
        absolute = Math.abs(y);
        System.out.println("Absolue Value: "+absolute);
        
        double power = Math.pow(x, y);
        System.out.println("X to the power y = "+power);
        
        int round = Math.round(8.4f);
        System.out.println("Round od 8.8 = "+round);
        
        double pi = Math.PI;
        System.out.println("pi = "+pi);
    }
}
