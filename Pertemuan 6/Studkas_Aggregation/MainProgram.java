/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas_Aggregation;
import java.io.*;
import java.util.*;
/**
 *
 * @author User
 */
public class MainProgram {
    public static void main(String[] args){
        Karyawan k1 = new Karyawan("Hani", 1, "Personalia");
        Karyawan k2 = new Karyawan("Nita", 2, "Produksi");
        Karyawan k3 = new Karyawan("Ina", 3, "Produksi");
        Karyawan k4 = new Karyawan("Sari", 4, "Personalia");
    
        //Making a list
        //Personalia list
        List <Karyawan> karyawanPersonalia = new ArrayList<Karyawan>();
        karyawanPersonalia.add(k1);
        karyawanPersonalia.add(k4);
        
        //Making a list
        //Karyawan students
        List <Karyawan> karyawanProduksi = new ArrayList<Karyawan>();
        karyawanProduksi.add(k2);
        karyawanProduksi.add(k3);
        
        Divisi Personalia = new Divisi("Personalia", karyawanPersonalia);
        Divisi Produksi = new Divisi("Produksi", karyawanProduksi);
        
        List <Divisi> divisi = new ArrayList <Divisi>();
        divisi.add(Personalia);
        divisi.add(Produksi);
        
        //creating an instance of Institute
        Kantor kantor = new Kantor("CompOne", divisi);
        
        System.out.print("Total karyawan di perusahaan " + kantor.getNamaKantor() + " : ");
        System.out.println(kantor.getTotalKaryawanDiKantor());
    }
}
