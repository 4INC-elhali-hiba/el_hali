package istat;

/**
 *
 * @author Utente
 */
public class Regione1 {
    private String nome;
    private double[] valori;
    private String[] info;
    
    public Regione1(String[] info, double[] valori, String nome){
        this.nome=nome;
        copiaS(info);
        copiaD(valori);
    }
    
    private void copiaS(String[] arrP){
        this.info = new String[arrP.length];
        for(int i=0; i<arrP.length; i++){
            info[i]=arrP[i];
        }
    }
    
    public int maxValore(){
        int iMaxC=0;
            for(int c=0; c<valori.length; c++){
                if(valori[iMaxC]<valori[c]){
                    iMaxC=c;
                }
            }
        return iMaxC;
    }
    
    private void copiaD(double[] arrP) {
        this.valori = new double[arrP.length];
        for(int i=0; i<arrP.length; i++){
            valori[i]=arrP[i];
        }
    }

    public String beneMax(){
        String t ="";
        int iMax=0;
        for(int i=0; i<valori.length; i++){
            if(valori[iMax]<valori[i]){
                iMax=i;
            }
        }
        t+=nome+" bene con costo magggiore: "+info[iMax]+"\ncosto: "+valori[iMax];
        return t;
    }
    
    public double[] getValori() {
        return valori;
    }

    public String[] getInfo() {
        return info;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public String stampa(){
        return nome+"\ncosto "+info[0]+": "+valori[0]+"\ncosto "+info[1]+": "+valori[1];
    }
}
