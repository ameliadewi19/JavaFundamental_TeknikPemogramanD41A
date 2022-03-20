/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studkas_Composition;
import java.util.*;
import java.io.*;
/**
 *
 * @author User
 */
class MainProgram {
    public static void main (String[] args)
    {
        // Creating the Objects of Lagu class.
        Lagu l1 = new Lagu("Stupid Love Song", 3.08);
        Lagu l2 = new Lagu("EVEREST", 3.15);
        Lagu l3 = new Lagu("Hey kid, Close your eyes", 3.53);
        Lagu l4 = new Lagu("NAKKA", 3.32);
        Lagu l5 = new Lagu("BENCH", 3.45);
        Lagu l6 = new Lagu("Tictoc Tictoc Tictoc", 3.56);
        Lagu l7 = new Lagu("Next Episode", 3.15);
        // Creating the list which contains the
        // no. of books.
        List<Lagu> lagu = new ArrayList<Lagu>();
        lagu.add(l1);
        lagu.add(l2);
        lagu.add(l3);
        lagu.add(l4);
        lagu.add(l5);
        lagu.add(l6);
        lagu.add(l7);
        
        Album album = new Album(lagu, "NEXT EPISODE", "AKMU");
        
        List<Lagu> laguAlbum = album.getTotalSongsInThisAlbum();
        System.out.println("Judul : " + album.getAlbumTitle() + "\nSinger : " + album.getAlbumSinger());
        for(Lagu l : laguAlbum){
            System.out.println("Title : " + l.title + " and " + " Duration : " + l.duration);
        }
    }
}
