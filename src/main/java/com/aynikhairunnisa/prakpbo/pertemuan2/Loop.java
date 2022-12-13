package com.aynikhairunnisa.prakpbo.pertemuan2;// <- deklarasi package

public class Loop {// <- bagian class
    public static void main(String[] args){// <- method main
        //For
        //'fori'
        for (int i = 0; i < 5; i++){ // <- for dengan kondisi i = 0, i<5 dan i++
            System.out.println("Looping...(" + i + "/5");// <- tapilan output looping ke user (sebanya 5x perulangan)
        }
        System.out.println("For loop selesai! \n");// <- tampilan output ke user (loop for selesai)
        
        //While
        int j=0;// <- deklarasi variabel j = 0 
        while (j<5){// <- ketika j kurang dari 5
            System.out.println("Looping... (" + j + "/5");// <- tapilan output looping ke user (sebanya 5x perulangan)
            j++;// <- kondisi j + 1 
            //0 + 1 = 1 -> j = 1
            //1 + 1 = 2 -> j = 2
            //2 + 1 = 3 -> j = 3
            //3 + 1 = 4 -> j = 4
            //4 + 1 = 5 -> j = 5
        }
        System.out.println("While loop selesai ! \n");// <- tampilan output ke user (loop while  selesai)
        
        //Do While
        int k = 0;// <- deklarasi variabel k = 0
        do{
            System.out.println("Looping... (" + k + "/5");// <- tapilan output looping ke user (sebanya 5x perulangan)
            k++;//<- kondisi k + 1 
            //0 + 1 = 1 -> k = 1
            //1 + 1 = 2 -> k = 2
            //2 + 1 = 3 -> k = 3
            //3 + 1 = 4 -> k = 4
            //4 + 1 = 5 -> k = 5
        }while (k<5);// <- ketika j kurang dari 5
        System.out.println("Do-While loop selesai ! \n");// <- tampilan output ke user (loop do-while  selesai)
    }
}
    

