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
public class Soal4_GajiAgent {
    public static void main(String[] args){
        int gajiPokok = 500000;
        int potonganGaji = 0;
        int bonus = 0;
        int totalPenjualan = 0;
        int itemTerjual = 0;
        int gajiBersih = 0;
        
        Scanner sc= new Scanner(System.in);
        itemTerjual = sc.nextInt(); // input berapa jumlah item yang terjual
        totalPenjualan = itemTerjual * 50000; // untuk mencari hasil penjualan maka total penjualan dikali 50000
        
        if (itemTerjual < 15){ 
            /* 
               jika item yang terjual kurang dari 15 maka 
               akan mendapat potongan 15% dari total kekurangan
            */
            potonganGaji = (15*(750000 - totalPenjualan))/100;
            gajiBersih = gajiPokok - potonganGaji;
        } else if (itemTerjual >= 15 && itemTerjual < 40) {
            /* 
               jika item yang terjual kurang dari 40 maka 
               akan mendapat bonus 10% dari penjualan item
            */
            bonus = (10*totalPenjualan)/100;
            gajiBersih = gajiPokok + bonus;
        } else if (itemTerjual >= 40 && itemTerjual <= 80) {
            /* 
               jika item yang terjual kurang dari 81 maka 
               akan mendapat bonus 25% dari penjualan item
            */
            bonus = (25*totalPenjualan)/100;
            gajiBersih = gajiPokok + bonus;
        } else if (itemTerjual > 80) {
            /* 
               jika item yang terjual lebih dari 80 maka 
               akan mendapat bonus 35% dari penjualan item
            */
            bonus = (35*totalPenjualan)/100;
            gajiBersih = gajiPokok + bonus;
        }
        
        System.out.println(gajiBersih); // menampilkan gaji bersih yang didapat
    }
}
