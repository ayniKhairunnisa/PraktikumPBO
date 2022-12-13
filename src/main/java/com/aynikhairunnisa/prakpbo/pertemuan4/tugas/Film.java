package com.aynikhairunnisa.prakpbo.pertemuan4.tugas;

//Superclass (Parents class)
public class Film {
    //Attribute
    String kodeFilm;
    String genre;
    int durasi;
  
    //Method 
    public void populer(){
        System.out.println("Kode film : " + kodeFilm);
    }
    
    public void showInfo(){
        System.out.println("Maksimal durasi film " + durasi + " jam");
        System.out.println("Film dengan genre " + genre + " paling banyak di tonton");
        extraInfo();
    }
    
    // parameter di kosongkan karena nanti akan diisi oleh child class
    // Polymorphism -> overriding 
    // Method dengan nama yang sama antara parent class dan child class dengan isi yang berbeda 
    // serta parameter diperblehkan sama
    public void extraInfo(){}
}
