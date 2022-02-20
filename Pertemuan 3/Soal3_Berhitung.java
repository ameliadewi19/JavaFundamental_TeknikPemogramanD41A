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
public class Soal3_Berhitung {
    public static void main(String[] args){
        int hasil = 0;
        Scanner sc= new Scanner(System.in);
        int angka1 = sc.nextInt(); // input angka pertama
        String simbol = sc.next(); // input jenis kalkulasi apa yang diinginkan
        int angka2 = sc.nextInt(); // input angka kedua
        
        if (simbol.equals("+")){ // operasi tambah
            hasil = angka1 + angka2; 
        } else if (simbol.equals("-")){ // operasi kurang
            hasil = angka1 - angka2;
        } else if (simbol.equals("*")){ // operasi kali
            hasil = angka1 * angka2;
        } else if (simbol.equals("/")){ // operasi bagi
            hasil = angka1 / angka2;
        } else if (simbol.equals("%")){ // operasi modulus
            hasil = angka1 % angka2;
        }
        
        System.out.println(hasil); // menampilkan hasil kalkulasi
    }
}
