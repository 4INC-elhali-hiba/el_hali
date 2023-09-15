/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazzo;

/**
 *
 * @author hiba.elhali
 */
public class Carta {
    private int numero;
    private String seme;
    
    public Carta(int numero, String seme){
        this.numero=numero;
        this.seme=seme;
    }
    
    public int getNumero(){
        return numero;
    }

    public String getSeme() {
        return seme;
    }
    
    public String getCarta(){
        return numero+" di "+seme;
    }
    
    public String stampa(){
        return "\nClasse Carta: "+"\nNumero: "+numero+"\nSeme: "+seme;
    }
}
