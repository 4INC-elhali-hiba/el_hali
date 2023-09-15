/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pompaCarburante;

/**
 *
 * @author Utente
 */
public class TreDistributoriTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nomi={"Benzina","Gasolio","Metano"};
        double[] prezzi={1.95,1.85,1.30};
        int[] capacitaC={25,20,30};
        int[] carbV={18,15,28};
        
        TreDistributori t=new TreDistributori(nomi,prezzi,capacitaC,carbV);
        System.out.println(t.distributoreMenoCostoso());
    }
    
}

