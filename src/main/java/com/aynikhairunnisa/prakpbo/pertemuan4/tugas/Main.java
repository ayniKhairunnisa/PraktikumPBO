package com.aynikhairunnisa.prakpbo.pertemuan4.tugas;

// menginpor scanner ke program
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // membuat scanner baru
        Scanner input = new Scanner (System.in);
        
        //Membuat object
        //Class object = new Class()
        Film fl = new Film();
        Komedi km = new Komedi();
        Horor hr = new Horor ();
        
        //Mengisis nilai attribute class Film
        fl.kodeFilm = "FL001";
        fl.genre = "komedi & horor";
        fl.durasi = 3;
        
        //Mengisis nilai attribute class Komedi
        km.kodeFilm = "FL001";
        km.genre = "komedi";
        km.jadwal = "16.00";
        
        //Mengisis nilai attribute class Horor
        hr.judul = "KKN Di Desa Penari";
        hr.genre = "horor";
        
        //Pemanggilan method pada class Film
        fl.populer();
        fl.showInfo();
        
        //Menu pilihan, user akna menginputkan bilangan 1/2 
        System.out.println("====== Menu Pilihan Genre Film =====");
        System.out.println("1. Komedi ");
        System.out.println("2. Horor");
        System.out.print("Silahkan masukkan pilihan [1/2]: ");
        int pilih = input.nextInt();
        
        // perjabangan if-else
        if(pilih == 1){ //jika usur menginput bilangan 1
            //pemanggilan method pada class Komedi
            km.lucu(2022);
            km.lucu();
            km.ekstraInfo();
        }
        else{//jika user menginput bilangan 2 (selain 1)
            //pemanggilan method pada class Horor
            hr.seram();
            hr.ekstraInfo();     
        }
        
        fl.extraInfo(); 
    }   
}
