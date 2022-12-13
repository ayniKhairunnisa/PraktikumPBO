package com.aynikhairunnisa.prakpbo.pertemua4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //membuat object
        //Class object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Truk tr = new Truk();
        
        //mengisi nilai attribute
        mb.nama = "Toyoya";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 4;
        
        tr.warna = "Hitam";
     
        //uji coba pemanggilan method
        mb.showInfo();
        mb.belok ("kanan");
        mb.belok();
        tr.extraInfo();
        
        kn.showInfo();
        
        
    }   
}
