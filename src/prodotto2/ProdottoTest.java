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
public class ProdottoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome="Patatine";
        double prezzo=0.95;
        int sconto=0;
        Data data= new Data(17,11,2023);
        Data scad= new Data(20,11,2023);
        
        String nome2="Alcol";
        double prezzo2=3.25;
        boolean plastica=true;
        
        Alimentari a = new Alimentari(scad,sconto,nome,prezzo);
        NonAlimentari n = new NonAlimentari(plastica,nome2,prezzo2);
        
    }
    
}
