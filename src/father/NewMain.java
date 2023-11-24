/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package father;

/**
 *
 * @author hiba.elhali
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pop=0;
        String fof="lol";
        
        Padre a = new Padre(pop);
        Figlio l = new Figlio(fof,pop);
        
        Padre p = new Padre(pop);
        Figlio f = new Figlio(fof,pop);
        Padre pf = new Figlio(fof,pop);
        Padre pp = pf;
        
        
        a.incrementa();
        l.incrementa();
        p.incrementa();
        pp.incrementa();
        f.incrementa();
        pf.incrementa();
        
        Figlio ff = (Figlio)pf;
        
        System.out.println("a "+a.toString());
        System.out.println("l "+l.toString());
        System.out.println("p "+p.toString());
        System.out.println("f "+f.toString());
        System.out.println("pf "+pf.toString());
        System.out.println("pp "+pp.toString());
        System.out.println("ff "+ff.toString());
    }
    
}
