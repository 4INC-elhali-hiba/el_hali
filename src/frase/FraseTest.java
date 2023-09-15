package frase;
import java.util.regex.Pattern;

/**
 *
 * @author Utente
 */
public class FraseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frase f = new Frase("prova $scrittura $di $un $testo.$");
        System.out.println(f.nParole());
        System.out.println(f.nCaratteri());
        System.out.println(f.inserisciParola("prima", 0, 0));
        System.out.println(f.spostamento(1, 4));
    }
    
}


