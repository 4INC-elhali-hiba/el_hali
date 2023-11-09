/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author Hiba
 */
public class OrologioDigitale extends Orologio{
    private int espressione;

    public OrologioDigitale(int espressione, int ora, int minuti, int secondi) {
        super(ora, minuti, secondi);
        this.espressione = espressione;
    }
    
    public int getEspressione(){
        return espressione;
    }
    
    public void selezionaEspressione(int formato){
        if(formato==12){
            espressione=12;
        }
    }

    public String dammiOrario() {
        String t;
        boolean b=false;
        if(espressione==12){
            t=getOra()/2+" : "+getMinuti()+" : "+getSecondi();
            if(getOra()>12){
                t+=" PM";
            }else{
                t+=" AM";
            }
        }else{
            t=super.dammiOrario();
        }
        return t;
    }
    
    
}
