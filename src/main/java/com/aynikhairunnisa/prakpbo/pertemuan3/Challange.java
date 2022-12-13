package com.aynikhairunnisa.prakpbo.pertemuan3;

public class Challange {
        //Attribute
        private String name;
        private int visitorsToday;
        private int yearsBuilt;
      
        //Constructor
        public  Challange(String name, int visitorsToday,  int yearsBuilt){
            this.name = name;
            this.visitorsToday = visitorsToday;
            this.yearsBuilt = yearsBuilt;
 
    }
        //Method yang akan mencetak semua attribute
        public void showProfile(){
        System.out.println("Nama                   : " + name);
        System.out.println("Pengunjung hari ini    : " + visitorsToday + " orang ");
        System.out.println("Tahun dibangun         : " + yearsBuilt);  
        System.out.println();
    } 
        
    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearsBuilt() {
        return yearsBuilt;
    }

    public void setYearsBuilt(int yearsBuilt) {
        this.yearsBuilt = yearsBuilt;
    }

    
}
