/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frase;

/**
 *
 * @author Utente
 */
public class Parola {
    private String testo;
    public Parola(String testo){
        this.testo=testo;
    }
    public String stampa(){
        return "Parola-testo = " + testo;
    }
    public String getTesto(){
        return testo;
    }
    public int nCaratteri(){
        return testo.length();
    }
    
}

