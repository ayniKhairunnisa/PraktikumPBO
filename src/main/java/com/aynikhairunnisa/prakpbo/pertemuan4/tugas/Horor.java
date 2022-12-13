package com.aynikhairunnisa.prakpbo.pertemuan4.tugas;

//Subclass (Child class)
//Menghubungkan kelas Horor ke kelas Film
public class Horor extends Film {
    //Attribute
    String judul;
    
    //Method 
    public void seram (){
        System.out.println("Judul film : " + judul);
    }
    
    // Polymorphism -> overriding
    public void ekstraInfo(){
        System.out.println("Genre " + genre + " mencapai 5 juta penonton dalam seminggu");
        
    } 
}
