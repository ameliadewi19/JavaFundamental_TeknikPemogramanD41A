/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumW3;

import java.util.*;
import java.math.BigInteger;

/**
 *
 * @author User
 */
public class Soal5_BukaTutupJalan {
    public static void main(String[] args){
        int index = 0; 
        String gabung, hasil; 
        /* 
            gabung digunakan untuk menampung keempat plat nomor
            hasil digunakan untuk menyatukan semua plat yang sudah dihapus spasinya
        */
        Scanner sc= new Scanner(System.in);
        
        gabung = sc.nextLine();
        String[] pisah = gabung.split("[ ]+"); // pisah digunakan untuk menampung masing masing plat nomor
        hasil = pisah[0]+pisah[1]+pisah[2]+pisah[3]; // menyatung semua plat yang sudah terpisah 
        long hasilKonversi = Long.parseLong(hasil); // mengkonversi hasil kedalam long integer
        
        hasilKonversi = hasilKonversi-999999; // mengurangi dengan 999999
        
        if (hasilKonversi % 5 != 0){ // jika hasilKonversi mod 5 tidak sama dengan 0
            System.out.println("berhenti");
        } else { // jika hasilKonversi mod 5 sama dengan 0
            System.out.println("jalan");
        }
    }
}
