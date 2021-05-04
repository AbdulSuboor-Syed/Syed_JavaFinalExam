/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06Example02;

/**
 *
 * @author S542047
 */
public class UnCheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 06 EXAMPLE 02");
        System.out.println("**********************************");
        int a=12;
        int b=0;
        
        try{
            int result=a/b;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero");
        }
        
        String s="Hello";
        try{
            System.out.println(s.charAt(a));
        }catch(StringIndexOutOfBoundsException se){
            System.out.println("Index out of bounds");
        }

    }
    
}
