/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09Example02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author S542047
 */
public class CheckedExceptions {
    public void fileNotFound() throws FileNotFoundException{
     File f = new File("nofile.txt");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("File Not Found");
           
        }
    public void classNotFound() throws ClassNotFoundException {

            Class.forName("Question09Example02.Unchecked");
        
        }
    }


