package com.aynikhairunnisa.prakpbo.pertemuan6.tugas;

public class Exception3 {
    public static void main(String[] args) {
       // uji coba pengisian varibel dengan tipe data int 
       // yang diisi dengan data bertipe String
       try{
          // Mengisi variabel 
          int num = Integer.parseInt("Ayni"); 
       
           //Menampilkan output dari variabel num 
           System.out.println(num);
       
       //Jika terjadi error program akan menjalankan perintah ini
       }catch(NumberFormatException e){
           System.out.println("Eror : Nilai variabel salah");
       }
       System.out.println("Program selesai!");
    }
}
