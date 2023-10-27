/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author hiba.elhali
 */
public class TriangoloRettangolo {

    private String id;

    public TriangoloRettangolo(String id) throws Exception {
        setId(id);
    }

    public String getId() {
        return id;
    }

    public final void setId(String id) throws Exception {
        try {
            if (!id.isEmpty()) {
                if (id.length() == 4) {
                    if (((id.charAt(0) >= 'A') && (id.charAt(0) <= 'Z') || (id.charAt(0) >= 'a') || (id.charAt(0) <= 'z'))
                            && ((id.charAt(1) >= 'A') && (id.charAt(1) <= 'Z') || (id.charAt(1) >= 'a') || (id.charAt(1) <= 'z'))) {
                        if (((id.charAt(2) >= '0') && (id.charAt(2) <= '9')) && ((id.charAt(3) >= '0') && (id.charAt(3) <= '9'))) {
                            Integer.parseInt(id);
                            this.id = id;
                        } else {
                            throw new Exception("Il id deve avere due numeri interi finali");
                        }
                    } else {
                        throw new Exception("Il id deve avere due lettere all'inizio");
                    }
                } else {
                    throw new Exception("Il id deve avere una lunghezza di 4 caratteri");
                }
            } else {
                throw new Exception("Il id non può essere vuoto");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException("Il id non può essere null");
        }

    }
}
