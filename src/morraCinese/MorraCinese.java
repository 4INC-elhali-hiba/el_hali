package morraCinese;

public class MorraCinese {
    private String giocatore1;
    private String giocatore2;
    
    public MorraCinese(String giocatore1, String giocatore2){
        this.giocatore1=giocatore1;//this serve a distinguere l'attributo dal parametro
        this.giocatore2=giocatore2;
    }
    
    public String getGiocatore1(){
        return giocatore1;
    }
    
    public void setGiocatore1(String giocatore1){
        this.giocatore1=giocatore1;//è possible anche usare il this. ma solo se i due nomi sono uguali
    }
    
    public String getGiocatore2(){
        return giocatore2;
    }
    
    public void setGiocatore2(String giocatore2){
        this.giocatore2=giocatore2;
    }
    
    public String gioca(int mano2){
        return "";
    }
    
    public String stampa(){
        String testo="";
        testo="G1: "+giocatore1 +"\nG2: "+giocatore2;
    }
      public String gioca(int mg){
      
        Random random=new Random();
        String esito;
        int mc=random.nextInt(3)+1;
        // 1 = Carta
        // 2 = Forbice
        // 3 = Sasso

        if(mg==mc){
            esito="Pareggio";
        }else{
            if((mg==1 && mc==2)||(mg==2 && mc==3)||(mg==3 && mc==1)){
               esito="Vince " + g2;
            }else{
               esito="Vince "+g1;
            }
        }
        esito+='\n'+ g1 + " ha giocato " + decGiocata(mg)+ '\n' 
                + g2 +"  ha giocato " + decGiocata(mc);
        return esito;
    }

}