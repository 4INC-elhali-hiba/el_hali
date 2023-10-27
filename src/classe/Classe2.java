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
    
    

}
