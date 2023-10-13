/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amministrazione;

/**
 *
 * @author hiba.elhali
 */
public class Appartamento {
    private int numero;
    private String nominativo;
    private int millesimi;
    
    public Appartamento(int numero,String nominativo,int millesimi){
        this.numero=numero;
        this.nominativo=nominativo;
        this.millesimi=millesimi;
    }
    
    public Appartamento(Appartamento a){
        this.numero=a.numero;
        this.nominativo=a.nominativo;
        this.millesimi=a.millesimi;
    }

    public int getNumero() {
        return numero;
    }

    public String getNominativo() {
        return nominativo;
    }

    public int getMillesimi() {
        return millesimi;
    }
    
    public String stampa(){
        return "Classe Appartamento: "+"\nnumero: "+numero+"\nnominativo: "+nominativo+"\nmillesimi: "+millesimi;
    }
}
