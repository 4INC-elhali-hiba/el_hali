package prodotto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class ProdottoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double prezzo=0.89;
        double iva=1.02;
        double peso=300;
        double tara=1.02;
        String desc="Patatine";
        String codBarre="8003130127922";
        
        Prodotto p=new Prodotto(prezzo,iva,peso,tara,desc,codBarre);
        System.out.println(p.prezzoIvato());
        System.out.println(p.pesoLordo());
        System.out.println(p.controlloCodice());
        System.out.println(p.stampa());
    }
}

