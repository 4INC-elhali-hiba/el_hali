/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazzo_setteemezzo;

/**
 *
 * @author hiba.elhali
 */
public class Giocatore {
    private String nome;
    private int partiteV;
    
    public Giocatore(String nome, int partiteV){
        this.nome=nome;
        this.partiteV = partiteV;
    }

    public String getNome() {
        return nome;
    }

    public int getPartiteV() {
        return partiteV;
    }
    
    public void incPartiteV(){
        partiteV++;
    }
    
    public String stampa(){
        return nome+" partite vinte: "+partiteV;
    }
}
