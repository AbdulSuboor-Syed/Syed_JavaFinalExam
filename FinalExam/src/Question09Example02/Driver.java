/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09Example02;

import java.io.FileNotFoundException;

/**
 *
 * @author S542047
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ArithmeticException, 
            StringIndexOutOfBoundsException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 09 EXAMPLE 02");
        System.out.println("**************************************");
        
        CheckedExceptions c= new CheckedExceptions();
        c.fileNotFound();
        c.classNotFound();
        
        UncheckedExceptions uc=new UncheckedExceptions(10, 0,"Hello");
        uc.arithmetic();
        uc.stringIndexOutOfBound();
        
    }
    
}
