/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10Example01;

import java.util.Scanner;

/**
 *
 * @author S542047
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 10 EXAMPLE 01");
        System.out.println("*****************************");
        Scanner scan= new Scanner(System.in);
        System.out.println("Given number will be added with (n-1) until it reaches zero");
        System.out.print("Please Enter a number: ");
        int n=scan.nextInt();
        System.out.println(sum(n));
                
        

    }

    public static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
        } else {
            return 0;
        }
    }
}
