package com.aynikhairunnisa.prakpbo.pertemuan2;// <- deklarasi package

import java.util.Scanner;// <- menginpor scanner ke program

public class Conditions {// <- bagian class
    public static void main(String[] args) {// <- method main
        Scanner input = new Scanner (System.in); // <- membuat scanner baru
        
        System.out.print("Masukkan Sebuah bilangan : "); // <- tampilan ouput ke user
        int bilangan = input.nextInt();// <- menggunakan scanner dan menyimpan apa yang diketik di variabel bilangan
        
        if(bilangan > 0)// <- jika variabel bilangan yang diinput user lebih besar dari 0
            System.out.print(bilangan + " adalah bilangan positif!");// <- tampilan output ke user (bilangan positif)
        
        else if(bilangan < 0)// <- maka jika  bilangan yang diinput user kurang dari 0
            System.out.print(bilangan + " adalah bilangan negatif!");// <- tampilan output ke user (bilangan negatif)
        
        else//<- maka kalau inputan tidak sesuai dengan dua kondisi diatas 
            System.out.print(bilangan + " adalah nol!");//<- ampilan output ke user (bilangan nol)
    }   
}
