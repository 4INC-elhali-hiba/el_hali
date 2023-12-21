/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Hiba
 */
public class Persona2 {

    private String cognome;
    private String nome;
    private Data dataDiNascita;
    protected static int numeroIstanze;

    public Persona2() {
        numeroIstanze++;
    }

    public Persona2(String cognome, String nome, Data dataDiNascita) throws Exception {
        try {
            setCognome(cognome);
            setNome(nome);
            setDataDiNascita(dataDiNascita);
            numeroIstanze++;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public final String getCognome() {
        return cognome;
    }

    public final Data getDataDiNascita() {
        return new Data(dataDiNascita);
    }

    public final  String getNome() {
        return nome;
    }

    public static final int getNumeroIstanze() {
        return numeroIstanze;
    }

    public final void setCognome(String cognome) throws Exception {
        controlloNominativi(cognome);
        this.cognome = cognome;
    }

    public final void setNome(String nome) throws Exception {
        controlloNominativi(nome);
        this.nome = nome;

    }

    public final void setDataDiNascita(Data dataDiNascita) throws Exception {
        try {
            if (Data.differenzaInGiorni(dataDiNascita, new Data()) < 0) {
                throw new Exception("La data di nascita non può essere successiva alla data attuale");
            } else {
                this.dataDiNascita = new Data(dataDiNascita);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    private void controlloNominativi(String nominativo) throws Exception {
        try{
            if (nominativo.isEmpty()) {
                throw new Exception("Il nome non può essere vuoto");
            } else if (!Character.isUpperCase(nominativo.charAt(0))) {
                throw new Exception("Il nome deve cominciare con una lettera maiuscola");
            }
        }catch(NullPointerException e){
            throw new Exception ("Il nominativo non può essere null");
        }
    }

    public Boolean verificaOmonimia(Persona2 persona) throws Exception {
        Boolean om= false;
        try{
            if (this.cognome.equals(persona.cognome) && this.nome.equals(persona.nome)) {
                om = true;
            }
        }catch(NullPointerException e){
            throw new Exception("L attributo inserito non può essere null");
        }
        return om;
    }

    public Integer calcolaEtà() throws Exception {
        try {
            return Data.differenzaInAnni(dataDiNascita, new Data());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public String info() throws Exception {
        String t;
        try {
            t = "Cognome: " + cognome + "\n"
                + "Nome: " + nome + "\n"
                + "Data di nascita: " + dataDiNascita.toString() + "\n";
        } catch (NullPointerException e) {
            throw new Exception(e.getMessage());
        }
        return t;
    }
    
    @Override
    public String toString(){
        return "Classe Persona\nNome: "+nome+"\nCognome: "+cognome+"\nData di nascita: "+dataDiNascita;
    }

}
