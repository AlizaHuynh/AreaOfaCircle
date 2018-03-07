/*
 * Aliza Huynh
 * AreaOfaCircle.java
 * This program takes the measurements of a circle in order to find the area
 */

package areaofacircle;

/**
 *
 * @author alhuy9821
 */
public class AreaOfaCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15.0;
        double pi = 3.14;
        double area = 0.0;
        
        area = pi*radius*radius;
        System.out.println("The area of the circle is " + area + " cm squared");
    }
    
}
