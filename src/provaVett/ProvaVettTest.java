
package provaVett;
/**
 *
 * @author hiba.elhali
 */
public class ProvaVettTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vett = {1,2,3,4,5,6};
        
        ProvaVett v = new ProvaVett(vett);
        /*System.out.println(v.scambioElementi(3, 4));
        System.out.println(v.media());
        System.out.println(v.modificaElemento(0, 0));
        System.out.println(v.cancellaElemento(0));
        System.out.println(v.cercaElemento(0));
        System.out.println(v.sommaElementi());
        System.out.println(v.sommaElementiDaVettore(vett));*/
        System.out.println(v.aggiungiElemento(3, 1));
        System.out.println(v.numeroElemento(0));
    }    
    
}
