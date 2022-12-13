package com.aynikhairunnisa.prakpbo.pertemuan2;// <- deklarasi package

import java.util.Scanner; // <- menginpor scanner ke program

public class Input {// <- bagian class
    public static void main(String[] args){ // <- method main
        Scanner input = new Scanner (System.in); // <- membuat scanner baru
        
        System.out.print("Masukkan Nama : ");// <- tampilan ouput ke user
        String nama = input.nextLine();// <- menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        
        System.out.print("Masukkan Usia : ");// <- tampilan ouput ke user
        int usia = input.nextInt(); // <- menggunakan scanner dan menyimpan apa yang diketik di variabel usia
        
        //tampilan output ke user (menampilkan apa yang sudah disimpan di variabel nama & usia) 
        System.out.println("Nama Saya   : "+ nama);
        System.out.println("Usia Saya   : "+ usia + " tahun ");
    }   
}
