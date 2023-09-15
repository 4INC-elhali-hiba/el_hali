/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testo;

/**
 *
 * @author hiba.elhali
 */
public class Testo {
    private String parola;
    //final private float PI_NUMERO = 3.14f; f per float final variables / per usarlo serve get
    public Testo(String parola) {
        this.parola = parola; //setParola(parola);
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {  //final public void = metodo non modificabile o se nn metodi costante
        this.parola = parola;
    }
    
    public String stampa(){
        String parola;
        
        parola = "the word is: " + this.parola;
        
        return parola;
    }
}
