package com.aynikhairunnisa.prakpbo.pertemuan6.tugas;

public class Exception1 {
    public static void main(String[] args) {
        // uji coba print nilai a
        try{
            //mengisi nilai variabel a dengan null
            String a = null;
            System.out.println(a.charAt(0));
        
        //Jika ditemukan error program akan menjalankan perintah ini
        }catch (NullPointerException e){
            System.out.println("Error : a Tidak memiliki nilai !");
        }
        System.out.println("Proses Selesai !");
    }
}

/*
        try{
            String a = null;
            System.out.println(a.charAt(0));
        }catch(NullPointerException e){
            System.out.println("");
        }
        */