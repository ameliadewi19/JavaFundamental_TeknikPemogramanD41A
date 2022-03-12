/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diperbaiki;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class RestaurantMain {
    public static void main(String[] args) {
        String nama;
        int jumlah;
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();
        
        System.out.println("Mengurangi stok gehu sebanyak 7 buah ");
        menu.kurangStokMakanan("Gehu", 7);
        menu.tampilMenuMakanan();
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukan nama makanan : ");
        nama = sc.next(); // input nama makanan
        System.out.print("Masukan jumlah makanan : ");
        jumlah = sc.nextInt(); // input jumlah makanan
        menu.tambahPesanan(nama, jumlah);
        menu.tampilMenuMakanan();
    }
}
