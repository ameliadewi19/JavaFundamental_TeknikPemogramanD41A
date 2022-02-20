/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumW3;
import java.util.*;

/**
 *
 * @author User
 */
public class Soal1_InputOutput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim(); // memotong kalimat dengan dipisah spasi
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("[!,?._'@ ]+"); // memisahkan karakter jika ada simbol ini
            System.out.println(strings.length); // menampilkan jumlah kata yang dipisah
            for (String str : strings)
                System.out.println(str); // menampilkan karakter yang sudah berpisah
        }
    }
}
