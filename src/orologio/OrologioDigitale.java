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

    public String selezionaEspressione(int formato){
        if(formato==12){
            espressione=12;
        }
        return "formato scelto: "+formato;
    }

    public String dammiOrario() {
        String t;
        int ore=super.getOra();
        if(espressione == 12) {
            if (getOra() > 12) {
                t = (ore - 12) + " : " + getMinuti() + " : " + getSecondi();
                t += " PM";
            } else {
                t = ore + " : " + getMinuti() + " : " + getSecondi();
                t += " AM";
            }
        }else{
            t=super.dammiOrario();
        }
        return t;
    }


}
