/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circonferenza;

/**
 *
 * @author Utente
 */
public class Circonferenza {
    private double x1A;
    private double y1A;
    private double x2B;
    private double y2B;
    
    public Circonferenza(double x1A, double y1A, double x2B, double y2B){
        this.x1A=x1A;
        this.y1A=y1A;
        this.x2B=x2B;
        this.y2B=y2B;
    }

    public double getX1A() {
        return x1A;
    }

    public double getY1A() {
        return y1A;
    }

    public double getX2B() {
        return x2B;
    }

    public double getY2B() {
        return y2B;
    }
    
    public double getPerimetro(){
        return 2*Math.PI*getRaggio();
    }
    
    public double getArea(){
        return Math.PI*Math.pow(getRaggio(),2);
    }
    
    public double getRaggio(){
        double r;
        r=Math.sqrt(Math.pow(x1A-x2B,2)+Math.pow(y1A-y2B,2));
        return r;
    }
    
    public String stampa(){
        String t="Classe Circonferenza:";
        t+="\nCoordinate punto A: ("+x1A+","+y1A+")";
        t+="\nCoordinate punto B: ("+x2B+","+y2B+")";
        return t;
    }
}

