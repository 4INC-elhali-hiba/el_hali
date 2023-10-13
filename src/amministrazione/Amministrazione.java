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
public class Amministrazione {
    private Condominio[] condomini;
    
    public Amministrazione(Condominio[] c){
        this.condomini=c;
    }
    
    public Amministrazione(Amministrazione a){
        this.condomini=a.condomini;
    }
    
    public String numMagg(){
        int index=0;
        int numMagg=0;
        for(int i=0;i<condomini.length;i++){
           if(numMagg<condomini[i].numeroAppartamenti()){
                numMagg=condomini[i].numeroAppartamenti();
                index=i;
            } 
        }
        return "\nnome:"+condomini[index].getNome()+"\nindirizzo: "+condomini[index].getIndirizzo();
    }
    
    public String numMaggMilli(){
        String t="";
        for(int i=0;i<condomini.length;i++){
            t+="\ncondominio: "+condomini[i].getNome()+"\nproprietario con maggiori millesimi: "+condomini[i].numMaggMilli();
        }
        return t;
    }
    
    public void aggCondo(Condominio c){
        Condominio[] copiaCondo= new Condominio[condomini.length+1];
        for(int i=0;i<condomini.length;i++){
            copiaCondo[i]=condomini[i];
        }
        copiaCondo[condomini.length]=c;
        condomini=copiaCondo;
    }
    
    public String stampa(){
        String t="\nClasse Amministratore:";
        for(int i=0;i<condomini.length;i++){
            t+="\n"+condomini[i].stampa();
        }
        return t;
    }
}
