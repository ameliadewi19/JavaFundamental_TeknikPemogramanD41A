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
public class MataKuliah {
    private String namaMatkul;

    public String getNamaMatkul(){
        return namaMatkul;
    }
    
    public void setNamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }
    
    @Override
    public String toString(){
        return namaMatkul;
    }
}
