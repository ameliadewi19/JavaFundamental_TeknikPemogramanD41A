/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas_Asociation;
import java.util.*;

/**
 *
 * @author User
 */
public class MainProgram {
    public static void main(String[] args){
        KelasJTK kelas = new KelasJTK();
        kelas.setNamaKelas("1A");
        
        MataKuliah mataKul1 = new MataKuliah();
        mataKul1.setNamaMatkul("Teknik Pemograman");
        MataKuliah mataKul2 = new MataKuliah();
        mataKul2.setNamaMatkul("Struktur Data dan Algoritma");
        MataKuliah mataKul3 = new MataKuliah();
        mataKul3.setNamaMatkul("Dasar-Dasar Pemograman");
        
        List<MataKuliah> empList = new ArrayList<MataKuliah>();
        empList.add(mataKul1);
        empList.add(mataKul2);
        empList.add(mataKul3);
        
        kelas.setKelasJTK(empList);
        
        System.out.println(kelas.getMatkul()+" adalah mata kuliah pada kelas "+kelas.getNamaKelas()+" D4 Teknik Informatika");
    }
}
