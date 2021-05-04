/*
 * To change this lixse header, choose Lixse Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10Example03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author S542047
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 10 EXAMPLE 03");
        System.out.println("***********************************");
        ArrayList<Integer> arr= new ArrayList<>();        
        for(int i=0;i<100;i++){
            arr.add((int)(Math.random()*100)+1);
        }        
        Collections.sort(arr);
        System.out.println("List of numbers to search from are:");
	for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
	}
        Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter the number to search : ");
	int x = sc.nextInt();
	
	boolean result = binarySearch(arr, 0, arr.size() - 1, x);
	if (result==true)
            System.out.println("Number found");
	else
            System.out.println("Number not found");
	}
	
	public static boolean binarySearch(ArrayList<Integer> li, int a, int b, int c) {
	
         if (b >= a) {
            int x = a + (b - a) / 2;
                if (li.get(x) == c) {
                    return true;
                }
                else if (c < li.get(x)) {
                    return binarySearch(li, a, x - 1, c);
                }
                else
                {
                    return binarySearch(li, x + 1, b, c);
                }
        }

        return false;
    }
}


    
    

