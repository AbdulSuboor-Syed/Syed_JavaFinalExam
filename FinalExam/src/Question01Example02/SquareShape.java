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
public class SquareShape extends Square {
    private double side;

    public SquareShape(double side) {
        this.side = side;
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
    public String toString() {
        return "Area of Square: "+String.format("%.2f", areaOfSquare())+
                "\nPerimeter of Square: "+String.format("%.2f", perimeterOfSquare());
    }
    
    
    
}
