package com.aynikhairunnisa.prakpbo.pertemua4.kendaraan;

//menghubungkan kelas Truk ke kelas parents (kelas kendaraan)
public class Truk extends Kendaraan {
    //Attribute
    String warna;
    
    public void extraInfo (){
        System.out.println("Warna Truk     : " + warna);
    } 
}
