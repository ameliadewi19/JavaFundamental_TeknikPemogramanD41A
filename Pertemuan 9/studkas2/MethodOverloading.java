/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studkas2;

/**
 *
 * @author User
 */
public class MethodOverloading {
    public static void main(String args[]){
        Overload Obj = new Overload();
        double result;
        Obj.demo(10);
        Obj.demo(10,20);
        result = Obj.demo(5.5);
        System.out.println("O/P : " + result);
    }
}
