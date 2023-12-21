/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Hiba
 */
public class Data {
    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;
    
    public Data(){
        
    }
    
    public Data(String data){
        
    }
    
    public Data(Integer giorno, Integer mese, Integer anno){
        
    }
    
    public Data(Data data){
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) throws Exception{
        try{
            int gg;
            int i=getMese();
            switch(i){
                case 2:
                    if((anno%400==0)||(anno%100!=0&&anno%4==0)){
                        gg=29;
                    }else{
                        gg=28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    gg=30;
                    break;
                default:
                    gg=31;
                    break;
            }
            if(!((giorno<1)||(giorno>gg))){
                this.giorno = giorno;
            }else{
                throw new Exception("Il giorno inserito non e valido");
            }
        }catch(NullPointerException e){
            throw new Exception ("L'attributo non puo' essere null");
        }
        
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) throws Exception {
        try {
            if (!((mese < 1) || (mese > 12))) {
                this.mese = mese;
            } else {
                throw new Exception("Il mese inserito non e' valido");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo non puo' essere null");
        }

    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }
    
    public String giornoDellaSettimana(){
        
    }
    
    public static Integer differenzaInGiorni(Data dataAntecedente, Data Successiva){
        
    }
    
    public static Integer differenzaInSettimane(Data dataAntecedente, Data Successiva){
        
    }
    
    public static Integer differenzaInAnni(Data dataAntecedente, Data Successiva){
        
    }
    
    public static String differenzaInGiorniMesiAnni(Data dataAntecedente, Data Successiva){
        
    }
    
    @Override
    public String toString(){
        String t;
        switch(mese){
            case 1:
                t="gennaio";
                break;
            case 2:
                t="febbraio";
                break;
            case 3:
                t="marzo";
                break;
            case 4:
                t="aprile";
                break;
            case 5:
                t="maggio";
                break;
            case 6:
                t="giugno";
                break;
            case 7:
                t="luglio";
                break;
            case 8:
                t="agosto";
                break;
            case 9:
                t="settembre";
                break;
            case 10:
                t="ottobre";
                break;
            case 11:
                t="novembre";
                break;
            default:
                t="dicembre";
                break;
        }
        return giornoDellaSettimana()+" "+giorno+" "+t+" "+anno;
    }
}
