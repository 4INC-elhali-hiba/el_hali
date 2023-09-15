/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pompaCarburante;

/**
 *
 * @author Utente
 */
public class PompaCarburante {
    private String nomeDistributore;
    private double prezzoCarburante;
    private int capacitaCisterna;
    private int carburanteVenduto;

    public PompaCarburante(String nomeDistributore, double prezzoCarburante, int capacitaCisterna, int carburanteVenduto){
        this.nomeDistributore=nomeDistributore;
        this.prezzoCarburante=prezzoCarburante;
        this.capacitaCisterna=capacitaCisterna;
        this.carburanteVenduto=carburanteVenduto;
    }
    
    public String getNomeDistributore() {
        return nomeDistributore;
    }

    public double getPrezzoCarburante() {
        return prezzoCarburante;
    }

    public int getCapacitaCisterna() {
        return capacitaCisterna;
    }

    public int getCarburanteVenduto() {
        return carburanteVenduto;
    }
    
    public int quantitaNecessaria(){
        return carburanteVenduto;
    }
    
    public int carburanteRimasto(){
        return capacitaCisterna-carburanteVenduto;
    }
    
    public double valoreCarbRimasto(){
        return carburanteRimasto()*prezzoCarburante;
    }
    
    public double importoPieno(){
        return carburanteVenduto*prezzoCarburante;
    }
    
    public String stampa(){
        String t="Classe: PompaCarburante";
        t+="\nNome distributore: "+nomeDistributore;
        t+="\nPrezzo carburante: "+prezzoCarburante;
        t+="\nCapacità cisterna: "+capacitaCisterna;
        t+="\nCarburante venduto: "+carburanteVenduto;
        return t;
    }
}

