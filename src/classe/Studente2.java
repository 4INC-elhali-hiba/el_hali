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
public class Studente2 {

    private String cognome;
    private String nome;

    public Studente2(String cognome, String nome) {
        setCognome(cognome);
        setNome(nome);
    }

    public Studente2(Studente2 s) throws Exception {
        try {
            if (!s.getCognome().isEmpty()) {
                if (!s.getNome().isEmpty()) {
                    this.cognome = s.getCognome();
                    this.nome = s.getNome();
                } else {
                    throw new Exception("Il nome non può essere vuoto");
                }
            } else {
                throw new Exception("Il cognome non può essere vuoto");
            }
        } catch (NullPointerException e) {
            throw new Exception("I il nome e cognome non possono essere null");
        }

    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public final void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return cognome + " " + nome;
    }
}
