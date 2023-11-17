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
public class Alimentari extends Prodotto{
    private Data scad;
    private int sconto;
    
    public Alimentari(Data scad, int sconto, String nome, int prezzo){
        super(nome,prezzo);
        setScad(scad);
        setSconto(sconto);
    }

    public Data getScad() {
        return scad;
    }

    public int getSconto() {
        return sconto;
    }

    public final void setScad(Data scad) {
        this.scad = scad;
    }

    public final void setSconto(int sconto) {
        this.sconto = sconto;
    }
    
    public void possibileSconto(Data data) throws Exception{
        try{
            if(!((scad.getAnno()<data.getAnno())||(scad.getMese()<data.getMese())||(scad.getGiorno()<data.getGiorno()))){
                if(!((data.getGiorno()-scad.getGiorno()<)))
            }else{
                throw new Exception("\nIl prodotto è scaduto");
            }
        }
    }
}
