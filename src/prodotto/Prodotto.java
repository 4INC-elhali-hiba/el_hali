/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodotto;

/**
 *
 * @author Utente
 */
public class Prodotto {
    private double prezzo;
    private double iva;
    private double peso;
    private double tara;
    private String desc;
    private String codBarre;
    
    public Prodotto(double prezzo,double iva,double peso,double tara,String desc,String codBarre){
        this.prezzo=prezzo;
        this.iva=iva;
        this.peso=peso;
        this.tara=tara;
        this.desc=desc;
        this.codBarre=codBarre;
    }
    
    public Prodotto(Prodotto merce){
        this.prezzo=merce.prezzo;
        this.iva=merce.iva;
        this.peso=merce.peso;
        this.tara=merce.tara;
        this.desc=merce.desc;
        this.codBarre=merce.codBarre;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    public double getPeso() {
        return peso;
    }

    public double getTara() {
        return tara;
    }

    public String getDesc() {
        return desc;
    }

    public String getCodBarre() {
        return codBarre;
    }
    
    public double prezzoIvato(){
        return prezzo+(prezzo*iva/100);
    }
    
    public double pesoLordo(){
        return peso+tara;
    }
    
    public boolean controlloCodice(){
        boolean c=false;
        int somma=0;
        for(int i=0; i<codBarre.length()-2;i+=2){
            somma+=(codBarre.charAt(i)-'0')*3;
        }
        System.out.println(somma);
        for(int i=1;i<codBarre.length()-2;i+=2){
            somma+=codBarre.charAt(i)-'0';
        }
        System.out.println(somma);
        System.out.println((10-(somma%10)));
        System.out.println(somma%10);
        System.out.println((codBarre.charAt(0)-'0'));
        if((10-(somma%10))==(codBarre.charAt(0)-'0')){
            c=true;
        }
        return c;
    }
    
    public String stampa(){
        String t="Classe Prodotto: ";
        t+="\nPrezzo prodotto: "+prezzo+"$";
        t+="\nIva prodotto: "+iva+"%";
        t+="\nPeso prodotto: "+peso+"Kg";
        t+="\nTara prodotto: "+tara;
        t+="\nNome prodotto: "+desc;
        t+="\nCodice a barre: "+codBarre;
        return t;
    }
}

