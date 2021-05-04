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
public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(Circle cr) {
       if(area()<cr.area()){
           return -1;
       }
       else if(area()>cr.area()){
           return 1;
       }
       else{
           return 0;
       }
    }
    
}
