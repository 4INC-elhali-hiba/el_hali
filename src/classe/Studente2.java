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

    public final void setCognome(String cognome) throws Exception {
        controlloStringa(cognome);
        this.cognome = cognome;
    }

    public final void setNome(String nome) throws Exception {
        controlloStringa(nome);
        this.nome = nome;
    }

    public void controlloStringa(String attr) throws Exception{
        try {
            if (!attr.isEmpty()) {
                if(Character.isUpperCase(attr.charAt(0))){
                }else{
                    throw new Exception("L'attributo deve avere la prima lettera maiuscola");
                }
            } else {
                throw new Exception("L'attributo non può essere vuoto");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo non può essere null");
        }
    }

    public String toString() {
        return cognome + " " + nome;
    }
}
