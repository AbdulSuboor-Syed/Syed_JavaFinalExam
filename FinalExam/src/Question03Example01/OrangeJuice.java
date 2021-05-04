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
public class OrangeJuice extends Orange{

    public OrangeJuice(String name, double price) {
        super(name, price);
    }
    
    public String isSweet(){
        if(super.getName().equalsIgnoreCase("Valencia Orange")){
            return "Is very sweet";
        }
        else{
            return "Is sour";
        }
    }

    @Override
    public String toString() {
        return super.toString()+" "+isSweet();
    }
    
    
}
