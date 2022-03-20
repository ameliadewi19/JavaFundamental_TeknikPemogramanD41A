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
public class Kantor {
    String namaKantor;
    private List<Divisi> divisi;
    
    Kantor(String namaKantor, List<Divisi> divisi) {
        this.namaKantor = namaKantor;
        this.divisi = divisi;
    }
    // count total students of all departments
    // in a given institute
    public int getTotalKaryawanDiKantor() {
        int noOfKaryawan = 0;
        List<Karyawan> karyawan;
        for (Divisi dept : divisi)
        {
            karyawan = dept.getKaryawan();
            for (Karyawan k : karyawan)
            {
                noOfKaryawan++;
            }
        }
        return noOfKaryawan;
    }
    
    String getNamaKantor(){
        return this.namaKantor;
    }
}
