/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testStringMethods;

/**
 *
 * @author hiba.elhali
 */
public class StringMethodsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Mi chiamo Hiba";
        String str2 = "Ho 17 anni";
        
        System.out.println("Prova metodo charAt: ");
        System.out.println(str1.charAt(0));
        
        System.out.println("Prova metodo codePointAt: ");
        System.out.println(str1.codePointAt(0));
        
        System.out.println("Prova metodo codePointBefore: ");
        System.out.println(str1.codePointBefore(1));
        
        System.out.println("Prova metodo codePointCount: ");
        System.out.println(str1.codePointCount(3, 8));
        
        System.out.println("Prova metodo compareTo: ");
        System.out.println(str1.compareTo(str2));
        
        System.out.println("Prova metodo compareToIgnoreCase: ");
        System.out.println(str1.compareToIgnoreCase(str2));
        
        System.out.println("Prova metodo concat: ");
        System.out.println(str1.concat(str2));
        
        System.out.println("Prova metodo codePointAt: ");
        System.out.println(str1.codePointAt(0));
    }
    
}
