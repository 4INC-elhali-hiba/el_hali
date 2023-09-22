/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodotto;

/**
 *
 * @author hiba.elhali
 */
public class Azienda {
    private Supermercato[] supermercati;
    private String sedeLegale;
    private String nome;
    
    public Azienda(Supermercato[] supermercati, String sedeLegale, String nome){
        this.nome=nome;
        this.sedeLegale=sedeLegale;
        copia(supermercati);
    }
    
    private void copia(Supermercato[] supermercati){
        for(int i=0;i<supermercati.length;i++){
            this.supermercati[i]=supermercati[i];
        }
    }
    
    public void addProdotto(Prodotto merce, int indice){
        supermercati[indice].addProdotto(merce);
    }
}
