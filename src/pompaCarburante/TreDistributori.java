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
public class TreDistributori {
    private PompaCarburante[] distributori;
    public TreDistributori(String[] nomi, double[] prezzi, int[] capacitaC, int[] carbVenduto){
        distributori=new PompaCarburante[nomi.length];
        for(int i=0; i<distributori.length; i++){
            distributori[i]=new PompaCarburante(nomi[i], prezzi[i], capacitaC[i], carbVenduto[i]);
        }
    }
    public String distributoreMenoCostoso(){
        String t;
        int n=0;
        for(int i=0; i<distributori.length; i++){
            if(distributori[i].getPrezzoCarburante()<distributori[n].getPrezzoCarburante()){
                n=i;
            }
        }
        t="Distributore meno costoso: "+distributori[n].getNomeDistributore()
          +"\nPrezzo per 10L: "+(distributori[n].getPrezzoCarburante()*10)+
           "\nPrezzo al L: "+distributori[n].getPrezzoCarburante();
        return t;
    }
}

