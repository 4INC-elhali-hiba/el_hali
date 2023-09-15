/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circonferenza;

/**
 *
 * @author Utente
 */
public class CirconferenzaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1A=26;
        double y1A=50;
        double x2B=32;
        double y2B=18;
        
        Circonferenza c = new Circonferenza(x1A,y1A,x2B,y2B);
        System.out.println(c.getPerimetro());
        System.out.println(c.getArea());
        System.out.println(c.getRaggio());
    }
    
}

