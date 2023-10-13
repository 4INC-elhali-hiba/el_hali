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
public class Condominio {
    private Appartamento[] appartamenti;
    private String nome;
    private String indirizzo;
    
    public Condominio(Appartamento[] a,String nome,String indirizzo){
        this.appartamenti=a;
        this.nome=nome;
        this.indirizzo=indirizzo;
    }
    
    public Condominio(Condominio c){
        this.appartamenti=c.appartamenti;
        this.nome=c.nome;
        this.indirizzo=c.indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
    
    public int numeroAppartamenti(){
        return appartamenti.length-1;
    }
    
    public String numMaggMilli(){
        int numMagg=0;
        int index=0;
        for(int i=0;i<appartamenti.length;i++){
            if(numMagg<appartamenti[i].getMillesimi()){
                numMagg=appartamenti[i].getMillesimi();
                index=i;
            }
        }
        return appartamenti[index].getNominativo();
    }
    
    public String stampa(){
        String t="\nClasse Condominio: ";
        for(int i=0; i<appartamenti.length; i++){
            t+="\n"+appartamenti[i].stampa();
        }
        return t;
    }
}
