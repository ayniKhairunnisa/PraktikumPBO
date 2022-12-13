package com.aynikhairunnisa.prakpbo.pertemuan5;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        //Array
        int nilai[];
        nilai = new int [100];
        float rerata, total = 0;
        
        // Deklarasi Scanner untuk user input nanti
        Scanner input = new Scanner (System.in);
        
        // Membuat agar panjang array ditentukan input user
        System.out.println("---Program Input Nilai---");
        System.out.print("Masukkan jumlah matkul : ");
        int jml = input.nextInt();
        System.out.println();
  
        //Memasukkan nilai array 
        for(int i=0; i<jml; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai [i] = input.nextInt();
            total = total + nilai[i];
            
        }
        System.out.println();
        
        //Menampilkan semua nilai array
        System.out.println("---Daftar Nilai---");
        for (int i=0; i<jml; i++){
            System.out.println(i + ": " + nilai[i]);     
        }
        System.out.println();
        rerata = total/jml;
        System.out.println("Hasil nilai total adalah : " + total);
        System.out.println("Hasil nilai rata-rata adalah : " + rerata);
    }  
}
