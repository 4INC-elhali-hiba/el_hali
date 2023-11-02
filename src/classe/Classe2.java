/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author hiba.elhali
 */
public class Classe2 {
    private Studente2 capoClasse;
    private Studente2[] studenti;

    public Classe2(Studente2 capoClasse, Studente2[] studenti) {
        setCapoClasse(capoClasse);
        setStudenti(studenti);
    }

    public Studente2 getCapoClasse() {
        return capoClasse;
    }

    public Studente2[] getStudenti() {
        return studenti;
    }

    public final void setCapoClasse(Studente2 capoClasse) {
        this.capoClasse = capoClasse;
    }

    public final void setStudenti(Studente2[] studenti) {
        this.studenti = studenti;
    }
    
    public void invertiAttributi(){
        String t;
        for(int i=0;i<studenti.length;i++){
            t=studenti[i].getCognome();
            studenti[i].setCognome(studenti[i].getNome());
            studenti[i].setNome(t);
        }
    }
    
    public String toString(){
        String t="\nClasse Classe\ncapo classe: "+capoClasse;
        for(int i=0; i<studenti.length; i++){
            t+="\nstudente: "+studenti[i].toString();
        }
        return t;
    }

}
