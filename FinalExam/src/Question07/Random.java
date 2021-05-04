/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author Syed Abdul Suboor
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 07");
        System.out.println("***************************************");
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[100];
	for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
	}                    
        System.out.print("Enter a number between 0-99: ");
        int num=sc.nextInt();
        System.out.println("*************************************");
        if(num>99||num<0){
            System.out.println("Out of Bounds");
        }
        else{
            System.out.println("Corresponding element at "+num+" is: "+arr[num]);
        }
        System.out.println("**************************************");
        }
    
  
    }
    

