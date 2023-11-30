/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodotto2;

/**
 *
 * @author hiba.elhali
 */
public class Prodotto {
    private String nome;
    private double prezzo;
    
    public Prodotto(String nome,double prezzo){
        setNome(nome);
        setPrezzo(prezzo);
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public final void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }
    
    public String stampa(){
        return "Classe Prodotto\nnome: "+nome;
    }
}
