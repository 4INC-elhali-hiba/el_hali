/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istat;

/**
 *
 * @author hiba.elhali
 */
public class Regione1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome="Trentino-Alto-Adige";
        double[] valori ={0.80,0.90};
        String[] info= {"pane", "latte"};
        Regione1 r = new Regione1(info, valori, nome);
        System.out.println(r.stampa());
    }
    
}
