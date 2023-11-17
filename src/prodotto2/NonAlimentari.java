/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodotto2;

/**
 *
 * @author hiba.elhali
 */
public class NonAlimentari extends Prodotto{
    private boolean plastica;
    
    public NonAlimentari(boolean plastica, String nome, double prezzo){
        super(nome,prezzo);
        setPlastica(plastica);
    }
    
    public boolean getPlastica(){
        return plastica;
    }

    public final void setPlastica(boolean plastica) {
        this.plastica = plastica;
    }
    
    public String stampa(){
        return "Classe NonAlimentari extends Prodotto\nnome: "+super.getNome()+"\nprezzo: "+super.getPrezzo()+"\nplastica: "+plastica;
    }
}
