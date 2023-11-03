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

    public Classe2(Studente2 capoClasse, Studente2[] studenti) throws Exception {
        this.studenti = new Studente2[studenti.length];
        for(int i=0;i<studenti.length;i++){
            this.studenti[i] = new Studente2(studenti[i]);
        }
        setCapoClasse(capoClasse);
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
    
    public void invertiAttributi() throws Exception{
        String t;
        for(int i=0;i<studenti.length;i++){
            t=studenti[i].getCognome();
            studenti[i].setCognome(studenti[i].getNome());
            studenti[i].setNome(t);
        }
        t=capoClasse.getCognome();
        capoClasse.setCognome(capoClasse.getNome());
        capoClasse.setNome(t);
    }
    
    public void ordinaCognome(){
        Studente2[] studentiCopia = new Studente2[studenti.length];
        int dimL=0;
        Studente2 s;
        for(int i='A';i<'Z';i++){
            for(int c=0;c<studenti.length;c++){
                if (studenti[c].getCognome().charAt(0) == i) {
                    studentiCopia[dimL] = studenti[c];
                    if (dimL > 1) {
                        if (studentiCopia[dimL - 1].getCognome().charAt(0) == studentiCopia[dimL].getCognome().charAt(0)) {
                            if (studentiCopia[dimL - 1].getCognome().charAt(1) == studentiCopia[dimL].getCognome().charAt(1)) {
                                if (studentiCopia[dimL - 1].getCognome().charAt(2) > studentiCopia[dimL].getCognome().charAt(2)) {
                                    s = studentiCopia[dimL - 1];
                                    studentiCopia[dimL - 1] = studentiCopia[dimL];
                                    studentiCopia[dimL] = s;
                                } else if (studentiCopia[dimL - 1].getCognome().charAt(2) < studentiCopia[dimL].getCognome().charAt(2)) {
                                    s = studentiCopia[dimL];
                                    studentiCopia[dimL] = studentiCopia[dimL - 1];
                                    studentiCopia[dimL - 1] = s;
                                }
                            } else {
                                if (studentiCopia[dimL - 1].getCognome().charAt(1) > studentiCopia[dimL].getCognome().charAt(1)) {
                                    s = studentiCopia[dimL - 1];
                                    studentiCopia[dimL - 1] = studentiCopia[dimL];
                                    studentiCopia[dimL] = s;
                                } else if (studentiCopia[dimL - 1].getCognome().charAt(1) < studentiCopia[dimL].getCognome().charAt(1)) {
                                    s = studentiCopia[dimL];
                                    studentiCopia[dimL] = studentiCopia[dimL - 1];
                                    studentiCopia[dimL - 1] = s;
                                }
                            }
                        }
                    }
                    dimL++;

                }
            }
        }
        studenti=studentiCopia;
    }
    
    public String stampa() throws Exception{
        /*invertiAttributi();*/
        ordinaCognome();
        String t="\nClasse Classe\ncapo classe: "+capoClasse;
        for(int i=0; i<studenti.length; i++){
            t+="\nstudente: "+studenti[i].toString();
        }
        return t;
    }

}
