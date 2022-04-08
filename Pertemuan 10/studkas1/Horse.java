/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studkas1;

/**
 *
 * @author User
 */
public class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    
    public static void main(String args[]){
        Animal obj = new Horse();
        obj.sound();
    }
}
