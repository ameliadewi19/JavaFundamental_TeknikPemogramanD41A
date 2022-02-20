/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumW3;
import java.util.*;

/**
 *
 * @author User
 */
public class Soal2_InputOutput2 {
    public static void main(String[] args){
        System.out.println("================================");
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            String myString = sc.next(); // input string
            int number = sc.nextInt(); // input angka
            System.out.printf("%-14s %03d\n", myString, number); // menampilkan string rata kiri dengan jarak 14 lalu menambahkan 0 didepan jika digit kurang dari 3
        }
        System.out.println("================================");
    }
}
