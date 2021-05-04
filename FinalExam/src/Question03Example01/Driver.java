/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03Example01;

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
        System.out.println("QUESTION 03 EXAMPLE 01");
        System.out.println("*******************************");
        int price=20;
        double price1= (double)price;
        OrangeJuice oj= new OrangeJuice("Valencia Orange", price1);
        
       //upcasting
        Orange o=oj;
        o=(Orange)oj;
        System.out.println(o.toString());
        
        //downcasting
        Orange o1= new OrangeJuice("Navel Orange", price1);
        System.out.println("Is Sweet?: "+((OrangeJuice)o1).isSweet());
        System.out.println("Price: "+o1.getPrice());    
    }
    
}
