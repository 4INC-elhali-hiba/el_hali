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
public class Padre {
    private int pp;

    public Padre(int pp) {
        setPp(pp);
    }

    public int getPp() {
        return pp;
    }

    public final void setPp(int pp) {
        this.pp = pp;
    }
    
    public void incrementa(){
        pp++;
    }
    
    
    
    @Override
    public String toString(){
        return "Classe Padre: \n"+"pp: "+pp;
    }
}
