package com.aynikhairunnisa.prakpbo.pertemuan2;// <- deklarasi package

public class Bonus {// <- bagian class
    public static void main(String[] args){// <- method main
    // While
        int j = 1;// <- deklarasi variabel j=1
        while(j <= 100){// <- ketika j kurang dari sama dengan 100
          System.out.println("Loading... (" + j + "%)");//<- tampilan output program
          j += 10; //<- kondisi

          if(j == 50){ //<- jika j sama dengan 50
            System.out.println("Udah ah, capek!");//<- tampilan output program
            break;
          }
        }
        System.out.println("Looping While selesai! \n");//<- tampilan output program
    }      
}
