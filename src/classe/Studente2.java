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

    public Studente2(String cognome, String nome) throws Exception{
        setCognome(cognome);
        setNome(nome);
    }

    public Studente2(Studente2 s) throws Exception {
        setCognome(s.getCognome());
        setNome(s.getNome());
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public final void setCognome(String cognome) throws Exception{
        try {
            if (!cognome.isEmpty()) {
                if(Character.isUpperCase(cognome.charAt(0))){
                    this.cognome=cognome;
                }else{
                    throw new Exception("Il cognome deve avere la prima lettera maiuscola");
                }
            } else {
                throw new Exception("Il cognome non può essere vuoto");
            }
        } catch (NullPointerException e) {
            throw new Exception("Il cognome non può' essere null");
        }
    }

    public final void setNome(String nome) throws Exception{
        try {
            if (!cognome.isEmpty()) {
                if(Character.isUpperCase(cognome.charAt(0))){
                    this.nome=nome;
                }else{
                    throw new Exception("Il nome deve avere la prima lettera maiuscola");
                }
            } else {
                throw new Exception("Il nome non può essere vuoto");
            }
        } catch (NullPointerException e) {
            throw new Exception("Il nome non può essere null");
        }
    }

    public String toString() {
        return cognome + " " + nome;
    }
}
