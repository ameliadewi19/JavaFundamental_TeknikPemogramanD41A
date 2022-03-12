/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diperbaiki;

/**
 *
 * @author User
 */
public class Restaurant {
    /* 
        variabel harus diset private agar data lebih secure
        ketika data dirahasiakan, perubahan dalam representasinya 
        tidak akan memengaruhi pengguna dari class, dan bug lebih 
        mudah untuk dideteksi.
    */
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public void kurangStokMakanan(String nama, int stok){
        for(int i=0; i<=id;i++){
            if(nama_makanan[i] == nama){
                this.stok[i] -= stok;
            }
        }
        
    }
    
    public void tampilMenuMakanan(){
        System.out.println("===================================");
        System.out.println("               Menu");
        System.out.println("===================================");
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            } 
        }
        System.out.println("");
    }
    
    public void tambahPesanan(String nama, int jumlah){
        double total = 0;
        for(int i=0; i<=id;i++){
            if(nama_makanan[i].equals(nama)){
                if(!isOutOfStock(i)){
                    this.stok[i] -= jumlah;
                    total = jumlah * harga_makanan[i];
                    tampilPesanan(nama, total);
                } else {
                    System.out.println("Stok habis!");
                }
            } 
        }
    }
    
    public void tampilPesanan(String nama, double total){
        System.out.println("===================================");
        System.out.println("           Data Pemesanan");
        System.out.println("===================================");
        System.out.println(nama + "\t\t\t" + total);
        System.out.println("");
    }
    
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
}

