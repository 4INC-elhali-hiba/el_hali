package provaVett;

import java.util.Random; //importazione libreria-classe (util = package, sottocartella di java)
/**
 *
 * @author Utente
 */
public class ProvaVett {
    
    private int[] vett;
    private int diml;
    
    public ProvaVett(int vett[]){
        diml = 0;
        setVett(vett);
        
    }

    public int[] getVett() {
        int[] vett = new int[this.vett.length];
        for(int i=0;i<vett.length;i++){
            vett[i] = this.vett[i];
        }
        return vett;
    }

    final public void setVett(int[] vett) {
        this.vett = new int[vett.length];
        for(int i = 0; i<vett.length; i++){
            this.vett[i] = vett[i];
            diml++;
        }
        //this.vett = vett;
    }
    
    
    private int[] addSpace(int[] vettore){
        int[] array = new int[vettore.length+1];
        for(int i=0;i<vettore.length;i++){
            array[i] = vettore[i];
        }
        return array;
    }
    
    private boolean isFull(){
        boolean v = false;
        if(diml==vett.length){
            v = true;
        }
        return v;
    }
    
    private int[] push(int[] vettore, int elemento){
        int [] array = new int[vettore.length+1];
        for(int i = 0; i<vettore.length; i++){
            array[i]=vettore[i];
        }
        array[vettore.length+1]=elemento;
        return array;
    }

    
    private boolean controlloPosizione(int posizione){
        boolean v = false;
        if(posizione >= 0 && posizione <vett.length){
            v = true;
        }
        return v;
    }
    
    public void caricamentoRandom(int min, int max){
        Random random = new Random();
        for(int i =0;i<this.vett.length;i++){
            int k = random.nextInt(max);
            while(k<min){
                k = random.nextInt(max);
            }
            this.vett[i]=k;
        }
        for(int i=0; i<vett.length; i++){
            System.out.println(vett[i]);
        }
        /*int[] vettore = vett;
        int i = 0;
        while(i<=vettore.length){
            vettore[i] = (int)Math.random(max-min+1)-min;
        }*/
    }
    
    public boolean scambioElementi(int posOrigin, int posDest){
        int[] vettore = vett;
        boolean v = false;
        if(controlloPosizione(posOrigin) && controlloPosizione(posDest)){
            int temp = vettore[posOrigin];
            vettore[posOrigin] = vettore[posDest];
            vettore[posDest] = temp;
            v = true;
        }
        for(int i=0; i<vettore.length; i++){
            System.out.println(vettore[i]);
        }
        return v;
    }
    
    public double media(){
        double media;
        media = sommaElementi()/vett.length;
        return media;
    }
    
    public boolean modificaElemento(int posizione, int valore){
        boolean v = false;
        if(controlloPosizione(posizione)){
            vett[posizione] = valore;
            v = true;
        }
        for(int i=0; i<vett.length; i++){
            System.out.println(vett[i]);
        }
        return v;
    }
    
    public boolean cancellaElemento(int posizione){
        boolean v = false;
        int[] vettore = new int[vett.length-1];
        if(controlloPosizione(posizione)){
            int k = 0;
            for(int i = 0; i<=posizione;i++){
                if(i != posizione){
                    vettore[k]=vett[i];
                    k++;
                }
            }
            for(int c = 0, f = 0; c<vett.length; c++, f++){
                if(c==posizione){
                   c++;
                }
                vettore[f]=vett[c];
            }
            for(int i = 0; i<vett.length;i++){
                if(i<posizione||i>posizione){
                    vettore[i] = vett[i];
                }else{
                    i++;
                }
            }
            v = true;
        }
        vett = vettore;
        for(int i=0; i<vett.length;i++){
            System.out.println(vett[i]);
        }
        return v;
    }
    
    public int cercaElemento(int valore){
        int[] vettore = vett;
        int i = 0;
        int pos = 0;
        while(i<=vettore.length){
            if(vettore[i]==valore){
                pos = i;
            }
            i++;
        }
        return pos;
    }
    
    public int sommaElementi(){
        int[] vettore = vett;
        int i = 0;
        int somma = 0;
        while(i<vettore.length){
            somma += vettore[i];
        }
        return somma;
    }
    
    public int sommaElementiDaVettore(int[] elementi){
        int[] vettore = vett;
        int somma = 0;
        for(int i=0; i<vettore.length; i++){
            somma += vettore[elementi[i]];
        }
        return somma;
    }
    
    public boolean aggiungiElemento(int posizione, int valore){
        boolean v = false;
        if(controlloPosizione(posizione)){
            if(isFull()){
                vett=addSpace(vett);
            }
            for(int i=diml; i>posizione; i--){
                vett[i+1]=vett[i];
            }
            vett[posizione]=valore;
            v=true;
        }
        for(int i=0; i<vett.length;i++){
            System.out.println(vett[i]);
        }
        return v;
    }

    
    public int numeroElemento(int valore){
        int n = 0;
        for(int i=0; i<vett.length; i++){
            if(vett[i]==valore){
                n++;
            }
        }
        return n;
    }
    
    public void unisci(int[] vettore){
        int[] array = new int[vett.length+vettore.length];
        for(int i=0; i<vett.length; i++){
            array[i]=vett[i];
        }
        for(int i=vett.length; i<vettore.length; i++){
            array[i]=vettore[i];
        }
        vett=array;
        for(int i=0; i<vett.length;i++){
            System.out.println(vett[i]);
        }
        /*for(int i=0; i<vettore.length; i++){
            array=push(array,vettore[i]);
        }
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }*/
    }
    
    public String stampa(){
        for(int i=0; i<vett.length;i++){
            System.out.println(vett[i]);
        }
        return String.valueOf(diml);
    }
}

