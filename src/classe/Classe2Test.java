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
public class Classe2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Studente2 capoClasse = new Studente2("Devescovi", "Riccardo");
            Studente2[] studenti = new Studente2[7];
            studenti[4] = capoClasse;
            studenti[2] = new Studente2("Calo'", "Giacomo");
            studenti[6] = new Studente2("Debortoli", "Andrea");
            studenti[3] = new Studente2("Bouche", "Gael");
            studenti[0] = new Studente2("El hali", "Hiba");
            studenti[5] = new Studente2("Fazio", "Andrea");
            studenti[1] = new Studente2("Feltrin", "Alessandro");
            Classe2 c = new Classe2(capoClasse, studenti);
            System.out.println(c.stampa());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
    
}
