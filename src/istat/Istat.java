package istat;

/**
 *
 * @author Utente
 */
public class Istat {
    private Regione[] regioni;
    
    public Istat(String[] nome, double[] pane, double[] latte){
        regioni= new Regione[nome.length];
        for(int i=0; i<regioni.length; i++){
            regioni[i]= new Regione(nome[i], pane[i], latte[i]);
        }
    }
    
    private int costoPane1(){
        int iMax=0;
        for(int i=1; i<regioni.length; i++){
            if(regioni[iMax].getPane()<regioni[i].getPane()){
                iMax = i;
            }
        }
        return iMax;
    }
    
    private int costoLatte1(){
        int iMax=0;
        for(int i=1; i<regioni.length; i++){
            if(regioni[iMax].getLatte()<regioni[i].getLatte()){
                iMax = i;
            }
        }
        return iMax;
    }
    
    public String costoPane(){
        int iMax=costoPane1();
        String t ="Regione con costo del pane più alto: "+regioni[iMax].getNome()+ "\nprezzo: " + regioni[iMax].getPane();
        return t;
    }
    
    public String costoLatte(){
        int iMax = costoLatte1();
        String t ="Regione con costo del latte più alto: "+regioni[iMax].getNome()+ "\nprezzo: " + regioni[iMax].getLatte();
        return t;
    }
    
    public String costoPaneLatte(){
        String t="Nessuna regione ha entrambi i costi più alti";
        int iMax=0;
        if(costoPane1()==costoLatte1()){
            t="\n"+regioni[iMax].getNome()+" ha entrambi i costi più alti"
                    +"\ncosti singoli:"+"\nprezzo pane: "+regioni[iMax].getPane()
                    +"\nprezzo latte: "+regioni[iMax].getLatte();
        }
        return t;
    }
    
    public String stampa(){
        String t ="Istat-regioni = ";
        for(int i=0; i<regioni.length; i++){
            t+="regioni[" + i + "]=" + regioni[i].stampa() + "\n";
        }
        return t;
    }
    
}

