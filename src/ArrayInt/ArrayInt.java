/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayInt;

/**
 *
 * @author hiba.elhali
 */
public class ArrayInt {
    private int[] array;
    private int dimL = 0;
    
    public ArrayInt(int dimF, int[] array){
        this.array = new int[dimF];
        for(int i = 0; i<dimF; i++){
            this.array[i] = array[i];
        }
    }
    public int[] getArray() {
        int[] array = new int[this.array.length];
        for(int i=0;i<array.length;i++){
            array[i] = this.array[i];
        }
        return array;
    }
    private boolean isFull(){
        boolean v = false;
        if(dimL==array.length){
            v = true;
        }
        return v;
    }
    private boolean controlloPosizione(int pos){
        boolean v = false;
        if(pos >= 0 && pos <array.length){
            v = true;
        }
        return v;
    }
    private int[] addSpace(int[] vettore){
        int[] vett = new int[vettore.length+1];
        for(int i=0;i<vettore.length;i++){
            vett[i] = vettore[i];
        }
        return vett;
    }
    public boolean add(int add){
        boolean v = false;
        if(!isFull()){
            for(int c=dimL; c<=dimL; c++){
                if(c==dimL){
                    array[dimL+c]=add;
                }
            }
            v = true;
            for(int i=0; i<array.length;i++){
                System.out.println(array[i]);
            }
        }
        return v;
    }
    public boolean addAll(int[] add){
        boolean v = false;
        if(isFull()){
            int[] array = new int[this.array.length+add.length]; //possibile anche usare dimL di add
            for(int i = 0; i<this.array.length; i++){
                array[i] = this.array[i];
            }
        }
        for(int i = array.length, k = 0; i<array.length+add.length; i++, k++){
            array[i] = add[k];
        }
        v = true;
        return v;
    }
    public boolean addFirst(int add){
        boolean v = false;
        if(!isFull()){
            array[dimL+1]=add;
            v = true;
            for(int i=0; i<array.length;i++){
                System.out.println(array[i]);
            }
        }
        return v;
    }
    public boolean addPos(int elem, int pos){
        boolean v = false;
        if(controlloPosizione(pos)){
            if(isFull()){
                array=addSpace(array);
            }
            for(int i=dimL; i>pos; i--){
                array[i+1]=array[i];
            }
            array[pos]=elem;
            v=true;
        }
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        return v;
    }
    public int[] cloneArray(){
        int[] vett = new int[array.length];
        for(int i=0;i<vett.length;i++){
            vett[i] = array[i];
        }
        return vett;
    }
    public boolean contains(int elem){
        boolean v=false;
        for(int i=0; i<array.length;i++){
            if(array[i]==elem){
                v=true;
            }
        }
        return v;
    }
    public void ensureCapacity(int minCapacity){
        int[] vett = new int[minCapacity];
        for(int i=0; i<array.length; i++){
            vett[i]=array[i];
        }
    }
    public int get(int pos){
        int elem = 0;
        if(controlloPosizione(pos)){
            elem = array[pos];
        }
        return elem;
    }
    public int indexOf(int elem){
        int i = 0; //serve un controllo
        for(int k=0; k<array.length; k++){
            
        }
        if(){
            for(int c=0; array[c]<=elem; c++)
                if(elem==array[c]){
                    i=array[c];
                }
        }
        return i;
    }
    public String stampa(){
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        return String.valueOf(dimL);
    }
}
