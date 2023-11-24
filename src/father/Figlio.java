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
public class Figlio extends Padre{
    private String ff;

    public Figlio(String ff,int pp) {
        super(pp);
        this.ff = ff;
    }

    public String getFf() {
        return ff;
    }

    public void setFf(String ff) {
        this.ff = ff;
    }
    
    @Override
    public void incrementa(){
        ff="ho modificato il metodo del padre";
    }
    
    @Override
    public String toString(){
        return "Classe Figlio:\n"+"ff: "+ff;
    }
}
