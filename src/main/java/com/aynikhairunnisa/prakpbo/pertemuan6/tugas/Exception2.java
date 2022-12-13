package com.aynikhairunnisa.prakpbo.pertemuan6.tugas;

public class Exception2 {
    public static void main(String[] args) {
        //Uji coba pemanggilan nama class
        try{
            Class.forName("Class1");
        }
        
        //Jika ditemukan error program akan menjalankan perintah ini
        catch(ClassNotFoundException e){
            System.out.println(e);
            System.out.println("Error : Nama class salah");
        }
        System.out.println("Program Slesai !");
    }
}
