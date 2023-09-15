package istat;

/**
 *
 * @author Utente
 */
public class Regione {
    private String nome;
    private double pane;
    private double latte;
    
    public Regione(String nome, double pane, double latte){
        this.nome=nome;
        this.pane=pane;
        this.latte=latte;
    }

    public String getNome() {
        return nome;
    }

    public double getPane() {
        return pane;
    }

    public double getLatte() {
        return latte;
    }
    
    public String stampa(){
        return nome+"\ncosto pane: "+pane+"\ncosto latte: "+latte;
    }
}

