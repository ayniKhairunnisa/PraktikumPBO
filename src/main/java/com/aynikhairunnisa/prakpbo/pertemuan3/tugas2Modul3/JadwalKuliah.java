package com.aynikhairunnisa.prakpbo.pertemuan3.tugas2Modul3;

public class JadwalKuliah {
    //Pendeklarasian attribute dari class JadwalKuliah
    private String namaMatkul;
    private int jumlahSks;
    private String ruangan;
    
    //constructor
    public JadwalKuliah(String namaMatkul, int jumlahSks, String ruangan) {
        this.namaMatkul = namaMatkul;
        this.jumlahSks = jumlahSks;
        this.ruangan = ruangan;
    }
    
    //Method yang akan mencetak semua attribut yang telah dideklarasikan sebelumnya
    public void showProfile(){
        System.out.println("Nama Mata Kuliah    : " + namaMatkul);
        System.out.println("Jumlah SKS          : " + jumlahSks);
        System.out.println("Ruang kuliah        : " + ruangan);
    }
    
    //Getter & Setter
    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }  
}
