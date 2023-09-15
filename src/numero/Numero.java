/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author hiba.elhali
 */
public class Numero {
    
    private int valore;
    
    public Numero(int valore) {
        this.valore = valore;
    }
    
    public double getValore() {
        return valore;
    }
    
    public void setValore(int valore){
        this.valore = valore;
    }
    
    public String somma(int v) {
        int s;
        s = v + valore;
        return "La somma dei valori è: " + s;
    }
    
    public String compareInt(int v) {
        String t;
        if (valore > v) {
            t = valore + " > " + v;
        } else
            if (valore == v){
                t = valore + " = " + v;
            } else {
                t = valore + " < " + v;
            }
        return t;
    }
    
    public boolean pariDispari() {
        boolean b = false;
        if((valore % 2) == 0) {
            b = true;
        }
        return b;
    }
    
    public boolean isNegativo() {
        boolean b = false;
        if (valore < 0) {
            b = true;
        }
        return b;
    }
    
    public String moltiplicatoreSomma(int v, int n){
        int c = 0;
        String d; 
        String s = ""; 
    
        while( c<=n ){
            c++;
            s = ""+ v+""; 
        }
        d = ""+v+"*"+n+"="+ s;
        return d;
    }
    
    public String tabellina(int v){
        String s = "";
        int c = 1;
        while(c<=10){
            s += " " + c*v;
            c++;
        }
        return s;
    }
    
    public String tavolaPitagorica (int v) {
        String s = "";
        int c = 1;
        int r = 1;
        while (c<=v){
            while (r<=v){
                s += c*r  +" ";
                r++;
            }
            r = 1;
            c++;
            s += "\n"; 
        }
        return s;
    }
    
    public String binario(){
        String s = "";
        int resto;
        int n = valore;
        while (n>0){
            resto = n%2;
            n = n/2;
            s = resto + s;
        }
        return s;
    }
    
    
    public String esadecimale(){
        String s = binario();
        String d = "";
        int i = 3;
        int n = 0;
        int t = s.length();
        int l = s.length()-4;
        int car;
        String r;
        int valtot = 0;
        switch(t % 4){
            case 1:
                s = "000" + s;
                t += 3;
            break;
            case 2:
                s = "00" + s;
                t += 2;
            break;
            case 3:
                s = "0" + s; 
                t += 1; 
            break;
        }
        while(t > 0){
            r = s.substring(l,t);
            while(i>=0){
                car = Integer.valueOf(r.charAt(i));
                valtot = valtot + car*(int)Math.pow(2,n);
                n++;
                i--;
                switch(valtot){
                    case 10:
                        d = "A" + d;
                        break;
                    case 11:
                        d = "B" + d;
                        break;
                    case 12:
                        d = "C" + d;
                        break;
                    case 13:
                        d = "D" + d;
                        break;
                    case 14:
                        d = "E" + d;
                        break;
                    case 15:
                        d = "F" + d;
                        break;
                    default:
                        d = valtot + d;
                        break;
                }
            }
            i = 3;
            n = 0;
        }
        return d;
    }
    
    public String sommaBinario(String bin){
        String val = binario();
        int l1 = bin.length();
        int l2 = val.length();
        int diffl;
        int c = 0;
        int i = 1;
        String valtot;
        int digit = 0;
        if(l2>l1){
            diffl = l2-l1;
        }else{
            diffl = l1-l2;
        }
        while(c<=diffl&(l1!=l2)){
           if(l1>l2){
               val = "0"+val;
           }else{
               bin = "0"+bin;
           }
           c++;
        }
        int length = val.length();
        while(i<=length){
            digit = digit << 1;
            if((bin.charAt(l1-i)=='1'&val.charAt(l2-i)=='0')|(val.charAt(l2-i)=='1'&bin.charAt(l1-i)=='0')){
                digit |= 1;
            }
            if(bin.charAt(l1-i)=='1'&val.charAt(l2-i)=='1'){
                digit |=1;
                digit = digit << 1;
            }
            i++;  
        }
        valtot = String.valueOf(digit);
        return valtot;
    }
    
    public String sommaBinarioArray(String bin){
        String val = binario();
        int l1 = bin.length();
        int l2 = val.length();
        int diffl;
        int c = 0;
        int i = 0;
        if(l2>l1){
            diffl = l2-l1;
        }else{
            diffl = l1-l2;
        }
        
        while(c<=diffl&(l1!=l2)){
            if(l1>l2){
                val = "0" + val;
            }else{
                bin = "0" + bin;
            }
            c++;
        }
        while(i<=val.length()){
            ;
        }
    }
    
    /*public String esadecimale(){
        String s = binario();
        String d = "";
        int t = s.length();
        int l = s.length()-1;
        int n = 1;
        int valtot = 0;
        int car;
        while(n<=4){
            car = Integer.valueOf(s.substring(l,t));
            valtot = valtot + (int)Math.round(Double.valueOf(car)*Math.pow(2,n));
            
            if(n==4){
                switch(valtot){
                    case 10:
                        d = "A" + d;
                        break;
                    case 11:
                        d = "B" + d;
                        break;
                    case 12:
                        d = "C" + d;
                        break;
                    case 13:
                        d = "D" + d;
                        break;
                    case 14:
                        d = "E" + d;
                        break;
                    case 15:
                        d = "F" + d;
                        break;
                    default:
                        d = valtot + d;
                        break;
                }
                n = 0;
            }
            t--;
            l--;
            n++;
        }
        return d;
    }
    
    /*public String baseX(int b){
        String s;
        int resto = 0;
        char l;
        int n = valore;
        while(n>0){
            resto = n % b;
        }
    }*/
    
    /*public String baseX(int b){
        String s = binario();
        String d = "";
        int valtot;
        int v=0;
        String car;
        double n = 0;
        int l = s.length();
        int i = 0;
        if(b==2){
            d = s;
            switch(b){
                case 4:
                    v = 2;
                break;
                case 8:
                    v = 3;
                break;
                case 16:
                    v = 4;
                break;
            }
            while(l>0){
                l--;
                car = s.substring(s.length()-1);
                valtot = (int)Math.round(Double.valueOf(car)*Math.pow(2,i)); //Double.intValue() non funziona
                i++;
                s = s.substring(0,s.length()-1);
                if(i==v){
                    i = 0;
                    //valtot = (int)valtot; //TypeCasting
                    switch(valtot){
                        case 10:
                            d = "A" + d;
                        break;
                        case 11:
                            d = "B" + d;
                        break; 
                        case 12:
                            d = "C" + d;
                        break;
                        case 13:
                            d = "D" + d;
                        break;
                        case 14:
                            d = "E" + d;
                        break;
                        case 15:
                            d = "F" + d;
                        break;
                        default:
                            d = valtot + d;
                        break;
                    }
                    valtot = 0;
                }
            }
        }
        return d;
    }
    
    /*public String esadecimale(String binario){
        int n;
        //substring​(int beginIndex, int endIndex)
        //metodo private per tradurre stringa in esadecimale
        //da destra a sinistra
        //method charAt?
    } 
*/
    public String stampa() {
        String s;
        s = "Valore: " + String.valueOf(valore);
        return s;
    }
}
