/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas_Composition;
import java.util.*;
import java.applet.*;

/**
 *
 * @author User
 */
class Album {
    private String title;
    private String singer;
    private final List<Lagu> lagu;
    Album (List<Lagu> lagu, String title, String singer){
        this.title = title;
        this.singer = singer;
        this.lagu = lagu;
    }
    
    public List<Lagu> getTotalSongsInThisAlbum(){
        return lagu;
    }
    
    private boolean isEmpty() {
        return lagu == null;
    }
    
    String getAlbumTitle(){
        return this.title;
    }
    
    String getAlbumSinger(){
        return this.singer;
    }
}
