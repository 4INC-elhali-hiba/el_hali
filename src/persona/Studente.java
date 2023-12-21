/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Hiba
 */
public class Studente extends Persona2{

    private final String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

    public Studente() {
        super();
    }

    public Studente(Integer classe, Boolean isRipetente, String cognome, String nome, Data dataDiNascita) throws Exception {
        super(cognome, nome, dataDiNascita);
        try {
            setClasse(classe);
            setIsRipetente(isRipetente);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        this.voti = new Float[0];
    }

    public Boolean verificaOmonimia(Studente studente) throws Exception {
        if (studente == null) {
            throw new Exception("Il parametro non può essere null");
        } else if (this.classe == null || studente.classe == null) {
            throw new Exception("Uno o più dati sono nulli");
        } else {
            Boolean risultato = false;
            if (this.classe.equals(studente.classe)) {
                try {
                    risultato = super.verificaOmonimia(studente);
                } catch (Exception e) {
                    throw new Exception(e.getMessage());
                }
            }
            return risultato;
        }

    }

    public final void setClasse(Integer classe) throws Exception {
        try {
            if (!(classe < 1 || classe > 5)) {
                this.classe = classe;
            } else {
                throw new Exception("La classe deve essere compresa tra 1 e 5");
            }
        }catch(NullPointerException e){
            throw new Exception("La classe non puo' essere null");
        }
    }

    public final void setIsRipetente(Boolean isRipetente) throws Exception {
        try{
            this.isRipetente = isRipetente;
        }catch(NullPointerException e){
            throw new Exception("L'attributo non puo' essere null");
        }
    }

    public final String getSCUOLA() {
        return SCUOLA;
    }

    public final Boolean getIsRipetente() {
        return isRipetente;
    }

    public final Integer getClasse() {
        return classe;
    }

    public void aggiungiVoti(Float voto) throws Exception {
        try{
            if (!(voto < 0 || voto > 10)) {
                Float[] temp = new Float[voti.length + 1];
                for (int i = 0; i < voti.length; i++) {
                    temp[i] = voti[i];
                }
                temp[voti.length] = voto;
                voti = temp;
            } else {
                throw new Exception("Il voto inserito non e' valido");
            }
        } catch (NullPointerException e){
            throw new Exception("L'attributo non puo' essere null");
        }
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        try {
            if (!(posizione >= voti.length || posizione < 0)) {
                Float[] temp = new Float[voti.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    if (i < posizione) {
                        temp[i] = voti[i];
                    } else if (i >= posizione) {
                        temp[i] = voti[i + 1];
                    }
                }
                voti = temp;
            } else {
                throw new Exception("La posizione inserita non e' valida");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo non puo' essere null");
        }
        
    }

    public Boolean promuovi() throws Exception {
        Boolean p = false;
        try {
            if (!(classe == 5)) {
                classe++;
                isRipetente=false;
                p = true;
            }else{
                throw new Exception("non e' possibile pruomuovere oltre la 5 classe");
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return p;
    }

    public Boolean promuovi(Integer numeroClassi) throws Exception {
        Boolean p = false;
        try{
            if (!((numeroClassi < 1)||((classe+ numeroClassi) >= 5))) {
                classe += numeroClassi;
                isRipetente=false;
                p = true;
            }else{
                throw new Exception("Il numero di classi inserite non e' valido");
            }
        }catch(NullPointerException e){
            throw new Exception("L'attributo non puo' essere null");
        }
        return p;
    }

    @Override
    public String info() throws Exception {
        if (classe == null || isRipetente == null || voti == null) {
            throw new Exception("Gli attributi non possono essere null");
        } else {
            String t = "Scuola: " + SCUOLA
            +"\nClasse: " + classe + "\n"
            +super.info() + "Ripetente: " + ((isRipetente) ? "si" : "no")
            +"\nVoti: " + controlloVoti() + "\n";
            return t;
        }
    }

    private String controlloVoti() {
        String t;
        if (voti.length == 0) {
            t = "non ci sono voti";
        } else {
            t= "["+voti[0];
            for (int i=1; i<voti.length; i++) {
                t+= ", "+voti[i];
            }
            t+= "]";
        }
        return t;
    }
    
    @Override
    public String toString(){
        String t="[";
        for(int i=0; i<voti.length; i++){
            t+= voti[i]+", ";
        }
        t+= "]";
        return "Classe Studente\n"+"SCUOLA: "+SCUOLA
                +"\nClasse: "+classe+"\nisRipetente"+isRipetente
                +"\nvoti"+t+super.toString();
    }

}
