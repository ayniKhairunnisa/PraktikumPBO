package com.aynikhairunnisa.prakpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        //Membuat sebuah array isi 3
        int[] myNumbers = {1, 2, 3};
        
        //Uji coba print nilai array index ke-10
        try{
            System.out.println(myNumbers [10]);
            
        }
        
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Aray tidak sampai sebanyak itu !");
        }
        System.out.println("Proses selesai !");
    }   
}
