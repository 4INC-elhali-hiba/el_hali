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
    
    public Alimentari(Data scad, int sconto, String nome, double prezzo){
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
        int diff;
        try{
            if(!((scad.getAnno()<data.getAnno())||(scad.getMese()<data.getMese())||(scad.getGiorno()<data.getGiorno()))){
                if(scad.getAnno()==data.getAnno()){
                    if(scad.getMese()==data.getMese()){
                        diff=scad.getGiorno()-data.getGiorno();
                        calcoloSconto(diff);
                    }else{
                        diff=diffMesiGiorni(data,scad);
                        calcoloSconto(diff);
                    }
                }
            }else{
                throw new Exception("\nIl prodotto è scaduto");
            }
        }catch (NullPointerException e){
            throw new Exception("\nl'attributo non può essre null");
        }
    }
    
    private boolean isScaduto(Data data) throws Exception{
        boolean scaduto=true;
        try{
           if(!(scad.getAnno()<data.getAnno())||(scad.getMese()<data.getMese())||(scad.getGiorno()<data.getGiorno())){
            scaduto=false;
           }else{
               throw new Exception("\nIl prodotto è scaduto");
           }
        }catch (Exception e){
            throw new Exception("\neccezione");
        }
        return scaduto;
    }
    
    private void calcoloSconto(int diff){
        if(diff<=10){
            if(diff<=2){
                sconto=50;
            }
            sconto=30;
        }
    }
    
    private int diffMesiGiorni(Data data, Data scad) {
        int numGiorni1;
        int diff;
        
        numGiorni1=numGiorni(data.getMese(),data.bisestile(data.getAnno()));
        
        diff=(numGiorni1-data.getGiorno())+scad.getGiorno();
        return diff;
    }
    
    private int numGiorni(int mese, boolean bisestile){
        int giorni;
        switch (mese) {
            case 2:
                if (bisestile) {
                    giorni = 29;
                } else {
                    giorni = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                giorni = 30;
                break;
            default:
                giorni = 31;
                break;
        }
        return giorni;
    }
    
    public String listino(Data data) throws Exception{
        if(!(isScaduto(data))){
            possibileSconto(data);
        }
        return super.getNome()+": "+(super.getPrezzo()-(super.getPrezzo()*(sconto/100)));
    }
    
    @Override
    public String toString(){
        return "Classe Alimentari extends Prodotto\n"+super.stampa()+"\nscadenza: "+scad.stampa()+"\nsconto: "+sconto;
    }
}
