/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetelahDiperbaiki;

/**
 *
 * @author User
 */
public class Restaurant extends Makanan{
    /* 
        variabel harus diset private agar data lebih secure
        ketika data dirahasiakan, perubahan dalam representasinya 
        tidak akan memengaruhi pengguna dari class, dan bug lebih 
        mudah untuk dideteksi.
    */
    private Makanan[] menu;
    private static byte id;
    
    public Restaurant(){
        menu = new Makanan[10];
        for(int i=0; i<10; i++){
            menu[i] = new Makanan();
        }
        id = 1;
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.menu[id].setNama_makanan(nama);
        this.menu[id].setHarga_makanan(harga);
        this.menu[id].setStok(stok);
    }
    
    public void kurangStokMakanan(String nama, int jumlah){
        int stok =  0;
        for(int i=0; i<=id;i++){
            if((menu[i].getNama_makanan()).equals(nama)){
                stok = menu[id].getStok() - jumlah;
                menu[id].setStok(stok);
            }
        }
    }
    
    public void tampilMenuMakanan(){
        System.out.println("===================================");
        System.out.println("               Menu");
        System.out.println("===================================");
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(menu[i].getNama_makanan() +"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
            } 
        }
        System.out.println("");
    }
    
    public void tambahPesanan(String nama, int jumlah){
        double total = 0;
        int temp = 0;
        for(int i=0; i<=id;i++){
            if((menu[i].getNama_makanan()).equals(nama)){
                if(!isOutOfStock(i)){
                    temp = menu[i].getStok() - jumlah;
                    menu[i].setStok(temp); 
                    total = jumlah * menu[i].getHarga_makanan();
                    tampilPesanan(nama, total);
                } else {
                    System.out.println("Stok habis!");
                }
            } 
        }
    }
    
    public void tampilPesanan(String nama, double total){
        System.out.println("===================================");
        System.out.println("           Data Pemesanan");
        System.out.println("===================================");
        System.out.println(nama + "\t\t\t" + total);
        System.out.println("");
    }
    
    public boolean isOutOfStock(int id){
        if(menu[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
}
