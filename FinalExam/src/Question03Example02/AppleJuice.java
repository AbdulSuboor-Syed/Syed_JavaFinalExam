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
public class AppleJuice extends Apple {

    public AppleJuice(String name, double price) {
        super(name, price);
    }
    public String isSweet(){
        if(super.getName().equalsIgnoreCase("Red Delicious")){
            return "Is very sweet";
            
        }
        else{
            return "Is not very sweet";
        }
    }

    @Override
    public String toString() {
        return super.toString()+" "+isSweet();
    }
    
    
}
