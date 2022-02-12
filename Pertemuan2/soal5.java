/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5;

/**
 *
 * @author User
 */
public class soal5 {
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        System.out.println("Nilai d : " + d);
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println("Nilai b : " + b);
    }
}
