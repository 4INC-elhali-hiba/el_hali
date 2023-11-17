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
public class Data {
    private int giorno;
    private int mese;
    private int anno;
    
    public Data(int giotno, int mese, int anno){
        setGiorno(giorno);
        setMese(mese);
        setAnno(anno);
    }

    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    public final void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public final void setMese(int mese) {
        this.mese = mese;
    }
    
    public final void setAnno(int anno) {
        this.anno = anno;
    }
    
    public int distanzaGiorni(Data data1, Data data2){
        int d;
        if((data2.getGiorno()-data1.getGiorno())<1){
            if(<=)
        }else{
            d=data2.getGiorno()-data1.getGiorno();
        }
    }
    
    public String stampa(){
        return "Classe Data\ngiorno: "+giorno+"\nmese: "+mese+"\nanno: "+anno;
    }
}
