/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08Example01;

/**
 *
 * @author S542047
 */
public class StringOutOfBound {

    public static void out()throws IndexOutOfBoundsException{
        String s="Hi";
       int index=10;
        //s.charAt(index);
        if(index>1){
            throw new IndexOutOfBoundsException("Please give index to the word 'Hi' ");
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 08 EXAMPLE 01");
        System.out.println("***********************************");
        try{
            out();
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
