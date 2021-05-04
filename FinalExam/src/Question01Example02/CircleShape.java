/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01Example02;

/**
 *
 * @author Syed Abdul Suboor
 */
public class CircleShape extends Circle {

    private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public double areaOfCircle() {
       return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double perimeterOfCircle() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Area of Circle: "+String.format("%.2f",areaOfCircle())+
            "\nPerimeter of Circle: "+String.format("%.2f",perimeterOfCircle());
    }
    
    
}
