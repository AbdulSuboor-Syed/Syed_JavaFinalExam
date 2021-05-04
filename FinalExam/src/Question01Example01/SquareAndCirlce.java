/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01Example01;

/**
 *
 * @author Syed Abdul Suboor
 */
public class SquareAndCirlce implements Square,Circle{
    
    private double radius;
    private double side;

    public SquareAndCirlce(double radius, double side) {
        this.radius = radius;
        this.side = side;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double areaOfSquare() {
        return side*side;
    }

    @Override
    public double perimeterOfSquare() {
        return 4*side;
    }

    @Override
    public double areaOfCircle() {
       return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double perimeterOfCircle() {
       return 2*Math.PI*radius;
    }
    
    public String toString(){
        return "Area of Square: "+String.format("%.2f", areaOfSquare())+
                "\nPerimeter of Square: "+String.format("%.2f", perimeterOfSquare())+
                "\nArea of Circle: "+String.format("%.2f",areaOfCircle())+
                "\nPerimeter of Circle: "+String.format("%.2f",perimeterOfCircle());
    }
    
    }

  
