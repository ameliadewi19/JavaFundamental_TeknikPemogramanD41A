/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2_datatypes;
import java.util.*;  

/**
 *
 * @author Amelia Dewi Agustiani
 */
public class soal2 {
    public static void main(String[] args)
	{
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter number : ");  
            double angka = sc.nextDouble(); 
            long min = -9223372036854775808L;
            long max = 9223372036854775807L;
            
            System.out.print((long) +angka);
            if (angka >= -128 && angka <= 127) {
                System.out.println(" Can be fitted in :");
                System.out.println("* byte\n* short\n* int\n* long");
            } else if (angka >= -32768 && angka <= 32767){
                System.out.println(" Can be fitted in :");
                System.out.println("* short\n* int\n* long");
            } else if (angka >= -214483648 && angka <= 214483647){
                System.out.println(" Can be fitted in :");
                System.out.println("* int\n* long");
            } else if (angka >= min && angka <= max){
                System.out.println(" Can be fitted in :");
                System.out.println("* long");
            } else {
                System.out.println(" Can't be fitted anywhere.");
            }
	}
}
