/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03Example02;

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
        System.out.println("QUESTION 03 EXAMPLE 02");
        System.out.println("***************************************");
         int price=20;
        double price1= (double)price;
        AppleJuice aj= new AppleJuice("Red Delicious", price1);
        
       //upcasting
        Apple a=aj;
        a=(Apple)aj;
        System.out.println(a.toString());
        
        //downcasting
        Apple a1= new AppleJuice("Honeycrisp", price1);        
        System.out.println("Is Sweet?: "+((AppleJuice)a1).isSweet());
        System.out.println("Price: "+a1.getPrice());
    
}
}
