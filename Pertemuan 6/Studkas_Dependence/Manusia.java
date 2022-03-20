/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas_Dependence;
import java.io.*;
import java.util.*;
/**
 *
 * @author User
 */
class Manusia {
    private String namaManusia;
    
    Manusia(String namaManusia){
        this.namaManusia = namaManusia;
    }
    
    public void menggunakanKendaraan(Kendaraan kendaraan){
        String kendaraanManusia = kendaraan.getNamaKendaraan();
        System.out.println(kendaraanManusia);
    }
    
    public String getNamaManusia(){
        return this.namaManusia;
    }
}
