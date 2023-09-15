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
public class NumeroTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v = 5;
        Numero n = new Numero(15);
        System.out.println(n.somma(v));
        System.out.println(n.compareInt(v));
        System.out.println(n.pariDispari());
        System.out.println(n.isNegativo());
        System.out.println(n.moltiplicatoreSomma(v, v));
        System.out.println(n.tabellina(v));
        System.out.println(n.tavolaPitagorica(5));
        System.out.println(n.binario());
        System.out.println(n.esadecimale());
        System.out.println(n.sommaBinario("1111"));
        //System.out.println(n.baseX(16));

    }
    
}
