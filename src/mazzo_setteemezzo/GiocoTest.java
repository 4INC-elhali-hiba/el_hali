/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazzo_setteemezzo;
import java.util.Scanner;
/**
 *
 * @author hiba.elhali
 */
public class GiocoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nGiocatori;
        System.out.println("inserire numero giocatori: ");
        nGiocatori=s.nextInt();
        String[] nomi=new String[nGiocatori];
        for(int i=0; i<nGiocatori; i++){
            System.out.println("\ninserire nome giocatore "+i+1);
            nomi[i]=s.nextLine();
        }
        System.out.println("\ninserire numero delle carte ");
        int nCarte=s.nextInt();
        
        Gioco g=new Gioco(nGiocatori, nomi, nCarte)
    }
    
}
