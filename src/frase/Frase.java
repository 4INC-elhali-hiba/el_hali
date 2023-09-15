package frase;
import java.util.regex.Pattern;
/**
 *
 * @author Utente
 */
public class Frase {
    private Parola[] parole;
    private int dimL;
    
    public Frase(String parole){
        String[] array = parole.split(Pattern.quote("$"));
        this.parole = new Parola[array.length];
        for(int i=0; i<array.length; i++){
            this.parole[i]=new Parola(array[i]);
        }
        dimL=array.length;
    }
    
    private String[] copiaP(String[] arP){
        String [] arA = new String[arP.length];
        for(int i=0; i<arP.length; i++){
            arA[i]=arP[i];
        }
        return arA;
    }
    
    private void incArray(){
        String[] temp = new String[parole.length];
        for(int i=0; i<parole.length; i++){
            temp[i]=parole[i];
        }
        this.parole=new String[temp.length+1];
        for(int i=0; i<temp.length; i++){
            parole[i]=temp[i];
        }
    }
    
    private boolean isFull(){
        boolean full = false;
        if(dimL==parole.length){
            full=true;
        }
        return full;
    }
    
    public String[] getParole(){
        return copiaP(parole); //per evitare la privacy leak
    }
    
    public void setParole(String[] parole){
        this.parole = new String[parole.length];
        for(int i=0; i<parole.length; i++){
            this.parole[i]=parole[i];
            dimL++;
        }
    }
   
    private void shiftDx(int posP, int posA) {
        for (int i = posA; i > posP; i--)
            parole[i] = parole[i-1];
    }
    
    private void shiftSx(int posP, int posA) {
        for (int i = posP; i < posA; i++)
            parole[i] = parole[i+1];
    }
    
    public int nParole(){
        return dimL;
    }
    
    public int nCaratteri(){
        int n=0;
        for(int i=0; i<dimL; i++){
            n+=parole[i].length();
        }
        return n;
    }
    
    /*public boolean cancellaParola(int posA, int posP){
        boolean allGood=false;
        shiftSx(posA, posP);
        dimL--;
        for(int c=0; c<parole.length;c++){ //per controllare
            System.out.println(parole[c]);
        }
        return allGood;
    }*/
    
    public boolean inserisciParola(String parola, int posP, int posA){
        boolean ris= true;
        if(isFull()){
            incArray();
        }
        shiftDx(posA, posP);
        parole[posA]=parola;
        dimL++;
        for(int c=0; c<parole.length;c++){ //per controllare
            System.out.println(parole[c]);
        }
        return ris;
    }
    
    public boolean spostamento(int posP, int posA) {
         boolean allGood=false;
        String parola = parole[posP];
        if (posP < posA){     
            shiftSx(posP,posA);
        }
        else {
            shiftDx(posA, posP); 
        }
        parole[posA] = parola;
        for(int i=0; i<parole.length;i++){
            System.out.println(parole[i]);
        }
        return allGood;
    }
    
    public String stampaFrase(){
        String t="";
        for(int i=0; i<dimL;i++){
            t+=parole[i].getTesto();
        }
        return t;
    }
}


