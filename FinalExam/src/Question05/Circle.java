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
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double area(){
        return Math.PI*Math.pow(radius,2);        
    }

    @Override
    public String toString() {
        return "Radius: "+radius+ " Area of Circle: "+String.format("%.2f",area());        
    }
    
    
    
    
}
