package com.aynikhairunnisa.prakpbo.pertemuan3;

public class Library {
    public static void main(String[] args) {
        // Membuat object dari class Challange 
         Challange satu = new Challange ("Dodi", 3, 2020);
         Challange dua = new Challange ("Budi", 8, 2021);
         Challange tiga = new Challange ("Bobi", 18, 2022);
        
        //menjalankan method 'showProfile() masing-masing object
        satu.showProfile();
        dua.showProfile();
        tiga.showProfile();
        
        //demo getter dan setter
        System.out.println("Nama pengunjung (before)" + dua.getName());
        dua.setName("Budi");
        System.out.println("Nama pengunjung (after)" + dua.getName());
        
        System.out.println("Pengunjung hari ini(before)" + dua.getVisitorsToday() + " orang");
        dua.setVisitorsToday(8);
        System.out.println("Pengunjung hari ini (after)" + dua.getVisitorsToday() + " orang");
        
        System.out.println("Tahun dibangun (before)" + dua.getYearsBuilt());
        dua.setYearsBuilt(2021);
        System.out.println("Tahun dibangun (after)" + dua.getYearsBuilt());
        
    }
}
