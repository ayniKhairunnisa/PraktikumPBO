package com.aynikhairunnisa.prakpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        //Membuat object scanner untuk memproses input user
         Scanner input = new Scanner (System.in);
        
        try{
            //User diminta memasukkan bilangan
            System.out.print("Masukkan bilangan : ");
            int bilangan =input.nextInt();
            
            System.out.print("Masukkan pembagi  : ");
            int pembagi = input.nextInt();
            
            //Proses pembagian
            int hasil = bilangan/pembagi;
            
            //Manampilakn output
            System.out.println("Hasil bagi (dibulatkan) : " + hasil);
        }
        /*
        //Jika ditemukan error, program akan menjalankan perintah ini
        catch(ArithmeticException | InputMismatchException e){
            System.out.println("Tidak dapat memproses !");
        }
        System.out.println("Prorses selesai !");
        */
        //Jika ditemukan error, program akan menjalankan berintah berikut
        catch(ArithmeticException e){
            System.out.println("Error : Tidak dapat memproses !");
        }
        catch(InputMismatchException e){
            System.out.println("Error : Harap masukkan angka saja !");
        }
        System.out.println("Prorses selesai !");
    }
}
