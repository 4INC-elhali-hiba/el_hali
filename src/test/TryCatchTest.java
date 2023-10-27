/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author hiba.elhali
 */
public class TryCatchTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try {
            /*System.out.print("inserisci il dividendo: ");
            int dividendo=in.nextInt();
            System.out.print("inserisci il divisore: ");
            int divisore=in.nextInt();
            int divisione=dividendo/divisore;
            System.out.println(divisione);
            //System.out.println(5/0);//programma si interrompe
        */} catch (ArithmeticException e) {//possibile indentare per avere dei catch dentro altri
            System.err.println("impossibile dividere per 0");//err per rosso
        } catch (Exception e) { //exception è generale quindi viene messa ultima 
            System.err.println("Errore generico");
        }finally{//viene eseguito anche quando si verifica un errore
                System.out.println("il codice scritto qui viene eseguito in ogni caso");
        }
        //i metodi per convenzione non mandano messaggi di errore
        //final: per un attributo dichiara una costante(non puo essere sovrascitto)
        
        
        try {
            int[] vett={1,2,3};
            for(int i=0; i<3; i++){
                System.out.println(vett[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("la lungezza del vettore va oltre il limite");
        }
        
    }
    
    //diverse classi gestiscono diversi controlli
    //Exception errore generico classe base di altri controlli: ArithmeticException
    
}
