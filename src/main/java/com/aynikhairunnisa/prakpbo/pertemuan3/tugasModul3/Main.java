package com.aynikhairunnisa.prakpbo.pertemuan3.tugasModul3;


public class Main {
    public static void main(String[] args) {
        //Membuat object dari class sayur
        Sayur murah = new Sayur ("Wortel", 8000, 2);
        Sayur terjangkau = new Sayur ("Selada", 15000, 5);
        Sayur mahal = new Sayur ("Kentang", 25000, 3);
        
        //menjalankan method 'showProfile()' masing-masing object
        murah.showProfile();
        terjangkau.showProfile();
        mahal.showProfile();
        
        //Demo Getter & Setter yang ada pada class Sayur
        System.out.println("Nama sayur (before)" + terjangkau.getNama());
        terjangkau.setNama("Selada");
        System.out.println("Nama sayur (after) " + terjangkau.getNama());
        
        System.out.println("Harga (before)" + terjangkau.getHarga()+ " /kg");
        terjangkau.setHarga(15000);
        System.out.println("Harga (after)" + terjangkau.getHarga() + " /kg");
        
        System.out.println("Berat (before)" + terjangkau.getBerat());
        terjangkau.setBerat(5 );
        System.out.println("Berat (after)" + terjangkau.getBerat());
    }  
}
