package com.aynikhairunnisa.prakpbo.pertemuan3.tugas2Modul3;

public class Main {
    public static void main(String[] args) {
        //membuat objeck dari class JadwalKuliah
        JadwalKuliah senin = new JadwalKuliah ("Administrasi Sistem", 2, "L-MM");
        JadwalKuliah selasa = new JadwalKuliah ("Pemrograman Berorientasi Objek", 2, "L-HP");
        JadwalKuliah rabu = new JadwalKuliah ("Sistem Fungsional Bisnis", 2, "IOT-102");
        
        //Menjalankan method 'showProfile()' pada masing-masing object
        senin.showProfile();
        selasa.showProfile();
        rabu.showProfile();
        
        //Demo Getter & Setter yang ada pada class JadwalKuliah
        System.out.println("Nama mata kuliah (before)" + selasa.getNamaMatkul());
        selasa.setNamaMatkul("Pemrograman Berorientasi Objek");
        System.out.println("Nama mata kuliah (after) " + selasa.getNamaMatkul());
        
        System.out.println("Jumlah SKS (before)" + selasa.getJumlahSks());
        selasa.setJumlahSks(2);
        System.out.println("Jumlah SKS (after)" + selasa.getJumlahSks());
        
        System.out.println("Ruang kuliah (before)" + selasa.getRuangan());
        selasa.setRuangan("L-HP");
        System.out.println("Ruang kuliah (after)" + selasa.getRuangan());
    }
}
