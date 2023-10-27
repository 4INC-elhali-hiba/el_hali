/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author hiba.elhali
 */
public class TriangoloRettangoloTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            TriangoloRettangolo t=new TriangoloRettangolo("b422");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
