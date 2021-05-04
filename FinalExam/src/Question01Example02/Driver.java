/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01Example02;

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
        System.out.println("QUESTION 01 EXAMPLE 02");
        System.out.println("***************************");
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side=scan.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        double radius=scan.nextDouble();
        System.out.println("***************************");
        CircleShape cs= new CircleShape(radius);
        SquareShape ss= new SquareShape(side);
        System.out.println(ss);
        System.out.println(cs);
        System.out.println("***************************");
        
    }
    
}
