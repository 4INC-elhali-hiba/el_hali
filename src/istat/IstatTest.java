package istat;

/**
 *
 * @author Utente
 */
public class IstatTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] regioni = {"Abruzzo", "Emilia Romagna", "Calabria", "Campania", "Basilicata", "Puglia", "Trentino-Alto-Adige", "Liguria", "Lombardia", "Marche", "Molise", "Piemonte", "Friuli Venezia Giulia","Veneto", "Sicilia", "Toscana", "Lazio", "Umbria","Valle d'Aosta", "Sardegna"};
        double[] pane= new double[]{2.0, 1.8, 0.1, 0.3, 1.4,0.4, 0.5, 1.7,0.6, 0.7, 0.8, 1.0, 1.1, 1.3, 1.5, 0.9,1.6, 0.2,2.0,1.2 };
        double[] latte= new double[]{2.0, 1.8, 0.1, 0.3, 1.4,0.4, 0.5, 1.7,0.6, 0.7, 0.8, 1.0, 1.1, 1.3, 1.5, 0.9,1.6, 0.2,2.0,1.2 };
        Istat i = new Istat(regioni, pane, latte);
        System.out.println(i.costoPane());
        System.out.println(i.costoLatte());
        System.out.println(i.costoPaneLatte());
    }
    
}

