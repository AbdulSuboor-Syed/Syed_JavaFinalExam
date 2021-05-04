/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09Example01;

/**
 *
 * @author S542047
 */
public class OrangeJuice {
    private String juiceName;

    public OrangeJuice(String juiceName) {
        this.juiceName = juiceName;
    }

    public String getJuiceName() {
        return juiceName;
    }

    public void setJuiceName(String juiceName) {
        this.juiceName = juiceName;
    }
    
    public String isPulp() {
        if (juiceName.equalsIgnoreCase("Tropicana Orange juice")) {
            throw new IllegalArgumentException("It contains pulp");
        } else {
            return "Does not contain pulp";
        }
    }

}
