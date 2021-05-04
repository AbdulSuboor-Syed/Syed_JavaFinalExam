/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06Example01;
  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author S542047
 */
public class CheckedException {



    public static void main(String args[]){
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 06 EXAMPLE 01");
        System.out.println("*************************************");
       File file = new File("nofile.txt");
        try {
            FileInputStream fic = new FileInputStream(file);
        } 
        catch (FileNotFoundException e) {            
            System.out.println("File Not Found");

   }
        try {
            Class.forName("Question06Example01.UncheckedException");
            } 
        catch (ClassNotFoundException ex) {
           System.out.println("Class Not Found");
        }

}
}
