/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01Example01;

import java.util.Scanner;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 01 EXAMPLE 01");
        System.out.println("***************************");
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side=scan.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        double radius=scan.nextDouble();
        SquareAndCirlce sr=new SquareAndCirlce(radius,side);
        System.out.println("*****************************");
        System.out.println(sr);
        System.out.println("*****************************");
    }
    
}
