/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas_Composition;
import java.io.*;
import java.util.*;

/**
 *
 * @author User
 */
class Lagu {
    public String title;
    public double duration;
    Lagu(String title, double duration){
        this.title = title;
        this.duration = duration;
    }
    
    String getTitleSong(){
        return this.title;
    }
    
    double getDuration(){
        return this.duration;
    }
}
