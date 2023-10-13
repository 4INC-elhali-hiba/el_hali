/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author Utente
 */
public class Studente {
    private int matricola;
    private String cognomeNome;
    private int annoNascita;
    private String comuneRes;
    
    public Studente(int matricola,String cognomeNome,int annoNascita,String comuneRes){
        this.matricola=matricola;
        this.cognomeNome=cognomeNome;
        this.annoNascita=annoNascita;
        this.comuneRes=comuneRes;
    }
    
    public Studente(Studente s){
        this.matricola=s.matricola;
        this.cognomeNome=s.cognomeNome;
        this.annoNascita=s.annoNascita;
        this.comuneRes=s.comuneRes;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getCognomeNome() {
        return cognomeNome;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public String getComuneRes() {
        return comuneRes;
    }
    
    public String stampa(){
        return "Classe Studente:"+"\nmatricola: "+matricola+"\ncognome nome: "+cognomeNome+"\nanno nascita: "+annoNascita+"\ncomune residenza: "+comuneRes;
    }
}

