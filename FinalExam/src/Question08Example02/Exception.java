/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08Example02;

/**
 *
 * @author S542047
 */
public class Exception {
    
    public static void div() throws ArithmeticException{
        int numerator=100;
        int denominator=0;
        //int result=numerator/denominator;
        if(denominator==0){
            throw new ArithmeticException("We cannot divide with denominator as zero");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 08 EXAMPLE 02");
        System.out.println("*************************************");
       try{
           div();
       }catch(ArithmeticException e){
           System.out.println(e);
       }
   }
    
}
