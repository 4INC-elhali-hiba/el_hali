/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroBinario;

/**
 *
 * @author hiba.elhali
 */
public class NumeroBinarioTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numero="1010";
        NumeroBinario n = new NumeroBinario(numero);
        System.out.println(n.sommaBinario("110"));
        System.out.println(n.sottrazioneBinario("101"));
    }
    
}
