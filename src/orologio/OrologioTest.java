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
        int ora=13;
        int minuti=22;
        int secondi=50;
        int espressione=12;
        boolean accensione=false;

        Orologio o = new Orologio(ora,minuti,secondi);
        OrologioDigitale d = new OrologioDigitale(24,ora,minuti,secondi);
        OrologioCucu c = new OrologioCucu(accensione,ora,minuti,secondi);
        
        System.out.println(d.selezionaEspressione(espressione));

        Orologio[] a = {o,d,c};
      
        System.out.println(a[0].dammiOrario());
        System.out.println(a[1].dammiOrario());
        //System.out.println(a[2].accensioneC(true));
        System.out.println(a[2].dammiOrario());

        for(int i=0;i<a.length;i++){
          a[i].aggiungiOre(5);
        }

        System.out.println(a[0].dammiOrario());
        System.out.println(a[1].dammiOrario());
        //System.out.println(a[2].accensioneC(true));
        System.out.println(a[2].dammiOrario());
    }

}

