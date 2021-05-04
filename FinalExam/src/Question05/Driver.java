/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author S542047
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 05");
        System.out.println("*************************");
        ComparableCircle c1=new ComparableCircle(2);
        ComparableCircle c2=new ComparableCircle(5);
        if(c1.compareTo(c2)>0){
            System.out.println(c1+" is greater");
        }
        else if(c1.compareTo(c2)<0){
            System.out.println(c2+" is greater");
        }
        else{
            System.out.println("Both are equal");
        }
        System.out.println("*************************");
    }
    
}
