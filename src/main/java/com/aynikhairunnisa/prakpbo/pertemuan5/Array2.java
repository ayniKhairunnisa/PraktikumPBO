package com.aynikhairunnisa.prakpbo.pertemuan5;

public class Array2 {
     public static void main(String[] args) {
        //pembuatan array
        String [] names = {
            "Ayni",
            "Khairun",
            "Nisa",
            "Mahasiswa"
        };
        // jika datanya sedikit gunakan array ini
        // String[] names = {"Ayni", "Khairun", "Nisa"};
        
        //Meng-cek panjang array
        System.out.println("Panjang array : " + names.length);
        
        //Menampilkan semua nilai array
         System.out.println("-- Nilai Array --");
        for (int i=0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }  
}
