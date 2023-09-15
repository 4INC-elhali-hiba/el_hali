/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newData;

/**
 *
 * @author Utente
 */
public class NewDataTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int giorno = 30;
        int mese = 4;
        int anno = 2024;
        
        NewData d = new NewData(giorno, mese, anno);
        System.out.println(d.isBisestile());
        System.out.println(d.domani());
        System.out.println(d.ieri());
        System.out.println(d.aggiungiGiorni(365));
        System.out.println(d.togliGiorni(3));
        
    }
    
}
