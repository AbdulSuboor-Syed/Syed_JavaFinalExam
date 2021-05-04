/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

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
        System.out.println("QUESTION 02");
        System.out.println("******************************");
        GeometricObject[] g= new GeometricObject[5];
        g[0]=new Square(4);
        g[1]=new Square(2);
        g[2]=new Square(3);
        g[3]=new Square(6);
        g[4]=new Square(9);
        
        for(int i=0;i<g.length;i++){
            System.out.println("Area of object "+(i+1)+" :"+g[i].calcArea());
            if(g[i] instanceof Colorable){
                System.out.print("How to color: ");
                ((Square)g[i]).howToColor();
                
            }
        }
        System.out.println("*********************************");
    }
    
}
