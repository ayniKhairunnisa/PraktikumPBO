package com.aynikhairunnisa.prakpbo.pertemua4.kendaraan;

public class Kendaraan {
    //Attribute (Variabel)
    String nama;
    int jmlRoda;
    
    //Method
    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + " telah dinyalakan!");
    }
    
    //Method yang akan mencetak semua attribut yang telah dideklarasikan sebelumnya
    public void showInfo(){
        System.out.println("Nama kendaraan : " + nama);
        System.out.println("Jml roda       : " + jmlRoda);
        extraInfo();
    }
    //parameter di kosongkan karena nanti akan diisi oleh child, jadi tidak perlu di isi ulang
    public void extraInfo(){}
}
