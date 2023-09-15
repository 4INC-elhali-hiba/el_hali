/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodotto;

/**
 *
 * @author Utente
 */
public class SupermercatoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome="Eurospin";
        String indirizzo="Via Soprasasso 20";
        double[] prezzo={0.40,0.89,3.20};
        double[] iva={1.04,1.02,2.01};
        double[] peso={500,300,150};
        double[] tara={0.02,0.01,0.05};
        String[] desc={"Acqua frizzante","Patatine","Deodorante"};
        int[][] codiceBarre={{1,2,3},{1,2,3}};
        String[] codBarre={"801796057020","8003130127922","8004120902758"};
        
        Supermercato s=new Supermercato(nome,indirizzo,prezzo,iva,peso,tara,desc,codBarre);
        System.out.println(s.prezzoAlto());
        System.out.println(s.valoreMerce());
        System.out.println(s.pesoMinore());
        System.out.println(s.merciSopraMedia());
        System.out.println(s.stampa());
    }
}

