package com.aynikhairunnisa.prakpbo.pertemuan3.tugasModul3;

public class Sayur {
    //Pendeklarasian attribut dari class Sayur
    private String nama;
    private int harga;
    private int berat;
    
    //Constructor
    public Sayur(String nama, int harga, int berat) {
        this.nama = nama;
        this.harga = harga;
        this.berat = berat;
    }
    
    //Method yang akan mencetak semua attribut yang telah dideklarasikan
    public void showProfile(){
        System.out.println("Nama Sayur  : " + nama);
        System.out.println("Harga       : Rp." + harga + "/kg");
        System.out.println("Berat       : " + berat + "kg");
    }
    
    //Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    } 
}
