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
public class KelasJTK {
    private String namaKelas;
    
    List<MataKuliah> matkul;
    
    public String getNamaKelas(){
        return namaKelas;
    }
    
    public void setNamaKelas(String namaKelas){
        this.namaKelas = namaKelas;
    }
    
    public List<MataKuliah> getMatkul(){
        return matkul;
    }
    
    public void setKelasJTK(List<MataKuliah> matkul){
        this.matkul = matkul;
    }
}
