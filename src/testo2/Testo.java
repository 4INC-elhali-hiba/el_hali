/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testo2;

/**
 *
 * @author Utente
 */
public class Testo{
    private String frase;
    
    public Testo(String frase){
        this.frase=frase;
    }

    public String getFrase() {
        return frase;
    }
    
    public String codifica(){
        String f="";
        for(int i=0;i<frase.length();i++){
            /*if(frase.charAt(i)<'0'){
                f+=frase.charAt(i);
            }
            else if(frase.charAt(i)=='A'||frase.charAt(i)=='a'||
                     frase.charAt(i)=='E'||frase.charAt(i)=='e'||
                     frase.charAt(i)=='I'||frase.charAt(i)=='i'||
                     frase.charAt(i)=='O'||frase.charAt(i)=='o'||
                     frase.charAt(i)=='U'||frase.charAt(i)=='u'){
                
            }*/
            switch(frase.charAt(i)){
                
            }
            }
        return f;
    }
    
    public String stampa(){
        return "Classe Testo:\n"+frase;
    }
}

