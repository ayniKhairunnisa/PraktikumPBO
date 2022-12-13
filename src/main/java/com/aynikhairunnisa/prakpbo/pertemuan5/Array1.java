package com.aynikhairunnisa.prakpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        //pembuatan array
        String [] names = new String[5];
        
        //Cek panjang array
        System.out.println("Panjang array : " + names.length);
        System.out.println("-- Nilai Array --");
        
        //Memasukkan nilai ke array
        names[0] = "Ayni";
        names[1] = "Khairunnisa";
        names[2] = "Nisa";
        
        //Menampilkan semua nilai array
        for (int i=0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }
}
