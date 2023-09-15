/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IPaddress;

/**
 *
 * @author hiba.elhali
 */
public class IPAddressTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPAddress i = new IPAddress("172.16.0.0","255.255.0.0");
        System.out.println(i.stampa());
    }
    
}
