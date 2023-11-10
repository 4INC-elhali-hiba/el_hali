/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orologio;

/**
 *
 * @author Hiba
 */
public class OrologioTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ora=15;
        int minuti=22;
        int secondi=50;
        int espressione=12;
        boolean accensione=false;
        
        Orologio o = new Orologio(ora,minuti,secondi);
        OrologioDigitale d = new OrologioDigitale(espressione,ora,minuti,secondi);
        OrologioCucu c = new OrologioCucu(accensione,ora,minuti,secondi);
        
        System.out.println(o.dammiOrario());
        System.out.println(d.dammiOrario());
        System.out.println(c.accensioneC(true));
        System.out.println(c.dammiOrario());
        
    }
    
}
