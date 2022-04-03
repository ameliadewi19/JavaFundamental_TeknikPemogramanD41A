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
public class Square extends Rectangle{
    public Square() {
        super.setWidth(0);
        super.setLength(0);
    }
    
    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public String toString(){
        return "Super[" + super.toString() + ",width=" + super.getWidth() + ",length=" + super.getLength() + "]";
    }
    
    @Override
    public double getArea(){
        return super.getArea();
    }
    
    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }
}
