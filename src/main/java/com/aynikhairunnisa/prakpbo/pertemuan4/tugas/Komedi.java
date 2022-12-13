package com.aynikhairunnisa.prakpbo.pertemuan4.tugas;

//Subclass (Child class)
//Menghubungkan kelas Komedi ke kelas Film
public class Komedi extends Film {
    //Attribute
    String jadwal;
    
    //Method 
    //Polymorphism -> overloading
    public void lucu(int tahunRilis){ //akan dieksekusi jika tipe data parameter nya adalah int tahunRilis
        System.out.println("Film dengan kode " + kodeFilm + " genre " + genre + " dirilis pada tahun " + tahunRilis);
    }
    
    public void lucu(){ 
        System.out.println("Film ini hannya sekedar komedi semata !");
    }
    
    // Polymorphism -> overriding 
    public void ekstraInfo(){
        System.out.println("Film tayang pada pukul " + jadwal + " WIB");
    }  
}
