/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Utente
 */
public class DataTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int giorno = 1;
        int mese = 4;
        int anno = 2024;
        
        Data d = new Data(giorno, mese, anno);
        System.out.println(d.isBisestile());
        System.out.println(d.domani());
        System.out.println(d.ieri());
        
    }
    
}

