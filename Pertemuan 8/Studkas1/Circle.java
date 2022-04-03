/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas1;

/**
 *
 * @author User
 */
public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    
    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    
    /** Constructs a Circle instance with the given radius and certain color */
    public Circle(double radius, String color){
        radius = radius;
        color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    /** Set the color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the color */
    public String getColor() {
        return color;
    }

    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
