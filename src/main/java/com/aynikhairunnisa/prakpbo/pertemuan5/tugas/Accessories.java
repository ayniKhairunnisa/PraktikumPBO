package com.aynikhairunnisa.prakpbo.pertemuan5.tugas;

//Menginpor scanner ke program
import java.util.Scanner;

//Class
public class Accessories {
    public static void main(String[] args) {
        // Membuat scanner 
        Scanner input = new Scanner (System.in);
        System.out.println();
        System.out.println("Program Input Data Barang Toko Lili");
        System.out.println("===================================");
        
        //Membuat agar panjang array ditentukan input user
        System.out.print("Masukkan jumlah data yang ingin diinputkan : ");
        int data=input.nextInt();
        
        //Array 
        int harga [] = new int [data];
        String jenis [] = new String [data];
        
        //Perulangan untuk memasukkan nilai array
        for (int i = 0; i < data; i++) {
            System.out.println("Barang ke-" + (i+1));
            System.out.print("Harga Barang    : Rp.");
            harga[i] = input.nextInt();
            
            //Percabangan
            if(harga[i] >= 500000 ){
                jenis[i] = "Emas";
            }else{
                jenis[i] = "Perak";
            }   
        }
        //Menampilkan semua nilai array
        System.out.println();
        System.out.println("--------- Data Barang Toko Lili ------------");
        System.out.println();
        System.out.println("No Jenis Harga");
        
        for (int i = 0; i < data; i++) {
            System.out.println((i+1)+"  "+jenis[i]+"  "+harga[i]);   
        }
    }  
}
