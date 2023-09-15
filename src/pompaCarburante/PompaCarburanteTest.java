/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pompaCarburante;

/**
 *
 * @author hiba.elhali
 */
public class PompaCarburanteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeCarburante = "Diesel";
        double prezzoCarburante = 2.08;
        int capacitaCisterna = 20;
        int carburanteVenduto = 15;
        PompaCarburante p = new PompaCarburante(nomeCarburante, prezzoCarburante, capacitaCisterna, carburanteVenduto);
        System.out.println(p.quantitaNecessaria());
        System.out.println(p.carburanteRimasto());
        System.out.println(p.valoreCarbRimasto());
        System.out.println(p.importoPieno());
    }
    
}

