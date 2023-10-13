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
public class AmministrazioneComp {
    private Condominio[] condomini;
    
    public AmministrazioneComp(Condominio[] c){
        this.condomini=new Condominio[c.length];
        for(int i=0;i<condomini.length;i++){
            condomini[i]=c[i];
        }
    }
    
    public AmministrazioneComp(AmministrazioneComp a){
        this.condomini=a.condomini;
    }
    
    public String numMagg(){
        int i=0;
        int index=0;
        int numMagg=0;
        while(i<condomini.length){
            if(numMagg<condomini[i].numeroAppartamenti()){
                numMagg=condomini[i].numeroAppartamenti();
                index=i;
            }
            i++;
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
