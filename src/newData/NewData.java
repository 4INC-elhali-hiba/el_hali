/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newData;

/**
 *
 * @author Utente
 */
public class NewData {
    
    private int anno;
    private int mese;
    private int giorno;
    private int[] vett;
    
    public NewData(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
            
        /*this.vett = new int[vett.length];
        for(int i=0; i<vett.length; i++){
            this.vett[i] = vett[i];
        }*/
        this.vett = new int[13];
        for(int i=0; i<13; i++){
            switch(i+1){
                case 2:
                    if(isBisestile()){
                        vett[i]=29;
                    }else{
                        vett[i]=28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    vett[i]=30;
                    break;
                default:
                    vett[i]=31;
                    break;
            }
        }
    }

    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public int getMese() {
        return mese;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    private boolean bisestile(int anno){
        boolean bisest = false;
        if((anno%400==0)||(anno%100!=0&&anno%4==0)){
            bisest = true;
        }
        return bisest;
    }
    
    public boolean isBisestile(){
        boolean bisest = false;
        String bis = "L'anno non è bisestile";
        if(bisestile(this.anno)){
            bisest = true;
            bis = "L'anno è bisestile";
        }
        System.out.println(bis);
        return bisest;
    }
    
    public String domani(){
        int day = giorno;
        int month = mese;
        int year = anno;
        String tomorrow = "Data domani: ";
        day++;
        if(day>vett[mese-1]){
            day = 1;
            month++;
            if(month>12){
                month = 1;
                year++;
            }
        }
        tomorrow += formattaData(day,month,year);  
        return tomorrow;
    }
    
    public String ieri(){
        int day = giorno;
        int month = mese;
        int year = anno;
        String yesterday = "Data ieri: ";;
        if((day-1)<1){
            if((month-1)<1){
                year--;
                month=12;
            }else{
                month--;
            }
            day=vett[month-1];
        }else{
            day--;
        }
        yesterday += formattaData(day,month,year);  
        return yesterday;
    }
    
    private String formattaData(int day, int month, int year){
        String data = "";
        data += day + "/" + month + "/" + year;
        return data;
    }
    
    public String aggiungiGiorni(int giorni){
        int day = giorno;
        int month = mese;
        int year = anno;
        String tomorrow = "Data giorni aggiunti: ";
        /*for(int c=0; c<giorni; c++){
            if(day>vett[month-1]){
                day = 1;
                month++;
                if(month>12){
                    month = 1;
                    year++;
                }
            }
            day++;
        }*/
        while(day>vett[month]){
            day -= vett[month];
            month++;
            if(month>12){
                month=1;
                year++;
            }
            if(bisestile(year)){
                vett[1]=29;
            }else{
                vett[1]=28;
            }
        }
        tomorrow += formattaData(day,month,year); 
        return tomorrow;
    }
    
    public String togliGiorni(int giorni){
        int day = giorno;
        int month = mese;
        int year = anno;
        String yesterday = "Data giorni tolti: ";
        for(int c=0; c<giorni; c++){
            if((day-1)<1){
                if((month-1)<1){
                    month = 12;
                    year--;
                }else{
                    month--;
                }
                day = vett[month-1];
            }else{
                day--;
            }
            
        }
        yesterday += formattaData(day,month,year);  
        return yesterday;
    }
    
    public String diffData(int day,int month,int year){
        int c=0;
        String dataDiff;
        while(giorno==day&&mese==month&&anno==year){
        }
        dataDiff = formattaData(day,month,year);
        return dataDiff;
    }
}

