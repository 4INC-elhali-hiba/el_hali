/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayInt;

/**
 *
 * @author hiba.elhali
 */
public class ArrayIntTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vett = {1,2,3,4};
        
        ArrayInt a = new ArrayInt(10, vett);
        System.out.println(a.add(5));
        System.out.println(a.addAll(vett));
        System.out.println(a.addFirst(0));
        System.out.println(a.addPos(9, 3));
        //System.out.println(a.cloneArray());
        System.out.println(a.contains(3));
    }
    
}
