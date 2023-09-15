/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Utente
 */
public class Data {
    
    private int anno;
    private int mese;
    private int giorno;
    private int[] vett;
    
    public Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
            
        /*this.vett = new int[vett.length];
        for(int i=0; i<vett.length; i++){
            this.vett[i] = vett[i];
        }*/
        this.vett = new int[13];
        for(int i=1; i<13; i++){
            switch(i){
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
    
    public boolean isBisestile(){
        boolean bisest = false;
        String bis = "L'anno non è bisestile";
        if(anno%400==0||(anno%4==0&&anno%100!=0)){
            bisest = true;
            bis = "L'anno è bisestile";
        }
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
}
