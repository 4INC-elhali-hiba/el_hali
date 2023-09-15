/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazzo;

/**
 *
 * @author hiba.elhali
 */
public class MazzoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroCarte= 13;
        String[] info = {"picche","fiori","cuori","quadri"};
        Mazzo m = new Mazzo(numeroCarte,info);
        System.out.println(m.cartePresenti());
        System.out.println(m.giraCarta());
        System.out.println(m.estraiCarta(6));
        System.out.println(m.cercaCarta(9));
        System.out.println(m.stampaMazzo());
    }
    
}
