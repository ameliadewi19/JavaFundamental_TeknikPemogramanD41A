/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas2;

/**
 *
 * @author User
 */
public class Main {
    public static void main (String[] args) {
        Circle c1 = new Circle(7, "Blue", true);
        System.out.println("Circle:"
            + " radius=" + c1.getRadius()
            + " base area=" + c1.getArea()
            + " perimeter=" + c1.getPerimeter());
        
        Rectangle r1 = new Rectangle(5, 4, "Orange", true);
        System.out.println("Rectangle:"
            + " width=" + r1.getWidth()
            + " length=" + r1.getLength()
            + " base area=" + r1.getArea()
            + " perimeter=" + r1.getPerimeter());
        
        Square s1 = new Square(10, "Turqoise", true);
        System.out.println("Square:"
            + " side=" + s1.getSide()
            + " base area=" + s1.getArea()
            + " perimeter=" + s1.getPerimeter());
    }
}

