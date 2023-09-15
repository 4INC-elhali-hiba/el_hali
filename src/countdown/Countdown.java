/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdown;

/**
 *
 * @author hiba.elhali
 */
public class Countdown {
    private int npart;
    public Countdown(int npart){
        setNpart(npart);
    }
    public int getNpart(){
        return npart;
    }
    public final void setNpart(int npart){
        if(npart>=0){
            this.npart = npart;
        }
    }
    public String conta(){
        int c = npart;
        String s = "";
        while(c>=0){
            switch(c){
                case 0:
                    s += "  ***  \n ** ** \n**   **\n**   **\n**   **\n ** ** \n  ***  \n\n";
                    break;
                case 1:
                    s += "  *** \n **** \n** ** \n   ** \n   ** \n  ****\n  ****\n\n";
                    break;
                case 2:
                    s += "  **** \n ******\n*** ***\n   *** \n  ***  \n*******\n*******\n\n";
                    break;
                case 3:
                    s += "  **** \n ******\n*** ***\n  **** \n** ****\n ******\n  **** \n\n";
                    break;
                case 4:
                    s += "    *** \n   **** \n  ** ** \n **  ***\n *******\n     ** \n\n";
                    break;
                case 5:
                    s += "*******\n*******\n***    \n****** \n     **\n****** \n****** \n\n";
                    break;
                case 6:
                    s += "  **** \n ******\n*** ***\n***    \n*******\n*** ***\n ***** \n\n";
                    break;
                case 7:
                    s += "*******\n*******\n   *** \n  ***  \n ***   \n***    \n\n";
                    break;
                case 8:
                    s += " ***** \n*** ***\n*** ***\n ***** \n*** ***\n*** ***\n ***** \n\n";
                    break;
                case 9:
                    s += " ***** \n*** ***\n*** ***\n ******\n    ***\n   *** \n  ***  \n\n";
                    break;
                case 10:
                    s += "  ***     ***  \n ****    ** ** \n** **   **   **\n   **   **   **\n   **   **   **\n  ****   ** ** \n  ****    ***  \n\n";
                    break;
                default:
                    s += c+"\n";
                    break;
            }
            //System.out.println(c); stampa c
            c--;
        }
        return s;
    }
    
    public String stampa(){
        String s;
        s = "il numero di partenza era: " + npart;
        return s;
    }
}
