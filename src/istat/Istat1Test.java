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
public class Istat1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] valori= {
            {2.0, 1.8},
            {0.5, 1.5},
            {0.1, 2.0}};
        String[] nome= {"Abruzzo", "Emilia Romagna", "Calabria"};
        String[] info= {"pane","latte"};
        Istat1 i = new Istat1(nome, valori, info);
        System.out.println(i.maxBeneRegione(1));
    }
    
}
