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
public class Classe {
    private Studente[] studenti;
    
    public Classe(Studente[] s){
        this.studenti=s;
    }
    
    public void aggiungiStudente(Studente s){
        Studente[] copiaStudenti=new Studente[studenti.length+1];
        for(int i=0; i<studenti.length;i++){
            copiaStudenti[i]=studenti[i];
        }
        copiaStudenti[studenti.length]=s;
        studenti=copiaStudenti;
    }
    
    public void togliStudente(int matricola){
        int index=trovaStudenteIndex(matricola);
        Studente[] copiaStudenti=new Studente[studenti.length-1];
        for(int i=0;i<studenti.length-1;i++){
            if(i>=index){
                copiaStudenti[i]=studenti[i+1];
            }else{
                copiaStudenti[i]=studenti[i];
            }
        }
        studenti=copiaStudenti;
    }
    
    public String trovaStudente(int matricola){
        return studenti[trovaStudenteIndex(matricola)].stampa();
    }
    
    private int trovaStudenteIndex(int matricola){
        boolean ok=false;
        int i=0;
        while(!ok){
            if(studenti[i].getMatricola()==matricola){
                ok=true;
            }else{
                i++;
            }
        }
        return i;
    }
    
    public String stampa(){
        String t="\nClasse Classe: ";
        for(int i=0;i<studenti.length;i++){
            t+="\n"+studenti[i].stampa();
        }
        return t;
    }
}

