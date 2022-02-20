/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumW3;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author User
 */
public class Soal6_BigNumber {
    public static void main(String[] args){
        BigInteger hasilTambah, hasilKali; // deklarasi variabel untuk hasil tambah dan kali dengan BigInteger
        int angka1, angka2; // deklarasi variabel untuk inputan dengan tipe integer
        
        Scanner sc= new Scanner(System.in); 
        angka1 = sc.nextInt(); // input angka pertama
        angka2 = sc.nextInt(); // input angka kedua
        hasilTambah = BigInteger.valueOf(angka1 + angka2); // menambahkan hasil angka1 dan angka2 lalu diubah ke tipe BigInteger
        hasilKali = BigInteger.valueOf(angka1 * angka2); // mengalikan hasil angka1 dan angka2 lalu diubah ke tipe BigInteger
        
        System.out.println(hasilTambah); // menampilkan hasil penjumlahan
        System.out.println(hasilKali); // menampilkan hasil perkalian
    }
}
