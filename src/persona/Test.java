/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;


/**
 *
 * @author Hiba
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String nome="Hiba";
            String cognome="El hali";
            String codFisc="LHLHB06YK";
            String dataDiNascita="01/09/2006";
            
            String nome2="Manar";
            String cognome2="El hali";
            String codFisc2="LHLMN04YK";
            String dataDiNascita2="20/02/2004";
            
            Persona p2 = new Persona(cognome2,nome2,codFisc2,dataDiNascita2);
            
            Persona p = new Persona (cognome,nome,codFisc,dataDiNascita);
            System.out.println(p.calcolaEta());
            System.out.println(p.verificaOmonimia(p2));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
