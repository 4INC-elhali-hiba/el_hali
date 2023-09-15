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
public class MazzoVerificaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nCarta = {"404", "311", "206", "205", "306", "304", "411", "108"};
        String[] info={"picche", "fiori", "quadri", "cuori"};
        MazzoVerifica m = new MazzoVerifica(nCarta, info);
        System.out.println(m.cartePresenti());
        System.out.println(m.giraCarta());
        System.out.println(m.stampaMazzo());
        System.out.println(m.cercaCarta(6));
    }
    
}
