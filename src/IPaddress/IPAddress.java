/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IPaddress;

import java.util.regex.Pattern;

/**
 *
 * @author hiba.elhali
 */
public class IPAddress {
    private NumeroBinario[] ip;
    private NumeroBinario[] subMask;
    
    public IPAddress(String ip, String subMask){
        String[] array = ip.split(Pattern.quote("."));
        /*this.ip = new NumeroBinario[array.length];*/
        for(int i=0; i<array.length; i++){
            this.ip[i]=new NumeroBinario(binario(array[i]));
        }
        String[] array2 = subMask.split(Pattern.quote("."));
        /*this.subMask = new NumeroBinario[array2.length];*/
        for(int i=0; i<array2.length; i++){
            this.subMask[i]=new NumeroBinario(binario(array2[i]));
        }
    }
    
    private String binario(String array){
        String s = "";
        int resto;
        int n = Integer.valueOf(array);
        while (n>0){
            resto = n%2;
            n = n/2;
            s = resto + s;
        }
        return s;
    }
    
    public String stampa(){
        String t ="IPAdress-ip = ";
        for(int i=0; i<ip.length; i++){
            t+="IP[" + i + "]=" + ip[i].stampa() + "\n";
        }
        t+="\nIPAdress-subMask = ";
        for(int i=0; i<subMask.length; i++){
            t+="SubnetMask[" + i + "]=" + subMask[i].stampa() + "\n";
        }
        return t;
    }
    
}
