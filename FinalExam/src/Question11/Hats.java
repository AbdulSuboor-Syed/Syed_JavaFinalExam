/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

//We import this class because we use Objects in hashCode() method
import java.util.Objects;

/**
 *
 * @author S542047
 */
public class Hats {
    // We have created three private instances
    private String hatType;
    private String model;
    private double price;

    // Here we have created a constructor
    public Hats(String hatType, String model, double price) {
        this.hatType = hatType;
        this.model = model;
        this.price = price;
    }

    //Here we have inserted getter and setter methods
    public String getHatType() {
        return hatType;
    }

    public void setHatType(String hatType) {
        this.hatType = hatType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //We have created a toString() method 
    @Override
    public String toString() {
        return "Hats{" + "hatType=" + hatType + ", model=" + model + ", price=" + price + '}';
    }

    /*
    We created .equals() and hashCode() methods in this class to give the condition
    on which we say that two objects are to be compared.In this example we have given
    hatType variable to be compared and if they both are same then to return true. 
    else return false.
    */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.hatType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hats other = (Hats) obj;
        if (!Objects.equals(this.hatType, other.hatType)) {
            return false;
        }
        return true;
    }
    
    
}
