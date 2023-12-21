/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;
import java.time.LocalDate;  
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Hiba
 */
public class Persona {
    private String cognome;
    private String nome;
    private String codFisc;
    private String dataDiNascita;
    
    public Persona(){
        
    }

    public Persona(String cognome, String nome, String codFisc, String dataDiNascita) throws Exception{
        setCognome(cognome);
        setNome(nome);
        setCodFisc(codFisc);
        setDataDiNascita(dataDiNascita);
    }
    
    public Persona(Persona persona) throws Exception{
        setCognome(persona.getCognome());
        setNome(persona.getNome());
        setCodFisc(persona.getCodFisc());
        setDataDiNascita(persona.getDataDiNascita());
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setCognome(String cognome) throws Exception{
        controlloNominativi(cognome);
        this.cognome = cognome;
    }

    public void setNome(String nome) throws Exception{
        controlloNominativi(nome);
        this.nome = nome;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public void setDataDiNascita(String dataDiNascita) throws Exception{
        controlloData(dataDiNascita);
        this.dataDiNascita = dataDiNascita;
    }
    
    private void controlloNominativi(String nominativo) throws Exception{
        try {
            if (!nominativo.isEmpty()) {
                if(Character.isUpperCase(nominativo.charAt(0))){
                }else{
                    throw new Exception("Il nominativo deve avere la prima lettera maiuscola");
                }
            } else {
                throw new Exception("Il nominativo non può essere vuoto");
            }
        } catch (NullPointerException e) {
            throw new Exception("Il nominativo non può essere null");
        }
    }
    
    private void controlloData(String data) throws Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            if(!data.isEmpty()){
                LocalDate ddn = LocalDate.parse(data, formatter);
            }else{
                throw new Exception("La data non puo essere vuota");
            }
        } catch (NullPointerException e) {
            throw new Exception("La data non può essere null");
        }
    }
    
    public boolean verificaOmonimia(Persona persona){
        boolean om=false;
        if(cognome.equalsIgnoreCase(persona.getCognome())&&nome.equalsIgnoreCase(persona.getNome())){
            om=true;
        }
        return om;
    }
    
    public Integer calcolaEta(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ddn = LocalDate.parse(dataDiNascita, formatter);
        LocalDate dataCor = LocalDate.now();
        
        Integer anni = Period.between(ddn, dataCor).getYears();
        
        return anni;
    }
    
    public String toString(){
        return "Classe Persona\n"+"cognome "+cognome+"\nnome "+nome+"\ncodice fiscale "+codFisc+"\ndata di nascita "+dataDiNascita;
    }

}
