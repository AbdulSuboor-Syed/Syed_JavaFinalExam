/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author S542047
 */
public class HatsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Here we have created 4 objects for Hats class
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 11");
        System.out.println("**********************************");
        Hats h1=new Hats("Cowboy","221OGL", 20);
        Hats h2=new Hats("Cowboy","OL907", 30);
        Hats h3=new Hats("Baseballcap","PL2895",15);
        Hats h4=new Hats("Baseballcap","PL2895",15);
        
        //If we were to compare each object with .equals method it would return
        //false as the method does not have any parameters to comapre the objects.
        /*
         Now that we have created the premises on which to compare the objects
         They value that is being returned is changed.
        */
        System.out.println("**************.equals()****************");
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1.equals(h4));
        System.out.println(h2.equals(h3));
        System.out.println(h2.equals(h4));
        System.out.println(h3.equals(h4));
        
        /*
        The hashCode() method returns the integer value that is associated 
        with each object.
        */
        System.out.println("***************hashCode()******************");
        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());
        System.out.println(h3.hashCode());
        System.out.println(h4.hashCode());
        
        /*
        By using Integer.toHexString(System.identityHashCode() method we get
        the reference address for each object.
        */
        System.out.println("************hashCode Address()*******************");
        System.out.println(Integer.toHexString(System.identityHashCode(h1)));
        System.out.println(Integer.toHexString(System.identityHashCode(h2)));
        System.out.println(Integer.toHexString(System.identityHashCode(h3)));
        System.out.println(Integer.toHexString(System.identityHashCode(h4)));
        
    }
    
}
