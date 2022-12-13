package com.aynikhairunnisa.prakpbo.pertemua4.kendaraan;

//menghubungkan kelas Mobil ke kelas parents (kelas Kendaraan)
public class Mobil extends Kendaraan{ 
    //Attribute (Variabel)
    int maxGear;
    
    //Method 1        
    public void belok (String arah){
        System.out.println("Mobil " + nama + " belok ke" + arah + "!");
    }
    
    //Method 2 parameter tidak di isi
    public void belok(){ //jika menambahkan parameter, tidak boleh sama dengan method 1
        System.out.println("Error          : Mohon masukkan arah !");
    }
    
    public void extraInfo(){
        System.out.println("Max gear       : " + maxGear);
    }
}
