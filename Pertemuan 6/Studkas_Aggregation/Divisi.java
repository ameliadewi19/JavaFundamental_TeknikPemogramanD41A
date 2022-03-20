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
public class Divisi {
    String nama;
    private List<Karyawan> KaryawanKantor;

    Divisi(String nama, List<Karyawan> KaryawanKantor) {
        this.nama = nama;
        this.KaryawanKantor = KaryawanKantor;
    }
    
    public List<Karyawan> getKaryawan(){
        return KaryawanKantor;
    }
}
