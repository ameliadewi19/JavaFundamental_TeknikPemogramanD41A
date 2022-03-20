/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas_Dependence;
import java.util.*;
import java.io.*;
/**
 *
 * @author User
 */
public class MainProgram {
    public static void main (String[] args)
    {
        Kendaraan kendaraan1 = new Kendaraan("Mobil");
        Kendaraan kendaraan2 = new Kendaraan("Motor");

        Manusia manusia1 = new Manusia("Rani");
        Manusia manusia2 = new Manusia("Ita");
        
        System.out.print(manusia1.getNamaManusia() + " menggunakan kendaraan ");
        manusia1.menggunakanKendaraan(kendaraan1);
        System.out.print(manusia2.getNamaManusia() + " menggunakan kendaraan ");
        manusia2.menggunakanKendaraan(kendaraan2);
    }
}
