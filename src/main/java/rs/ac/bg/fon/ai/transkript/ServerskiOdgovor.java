package rs.ac.bg.fon.ai.transkript;

import java.io.Serializable;

public class ServerskiOdgovor implements Serializable{
    
    private Object odgovor;
    private boolean uspesno;
    private String poruka;

    public ServerskiOdgovor() {
    }

    public ServerskiOdgovor(Object odgovor, boolean uspesno, String poruka) {
        this.odgovor = odgovor;
        this.uspesno = uspesno;
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public Object getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(Object odgovor) {
        this.odgovor = odgovor;
    }

    public boolean isUspesno() {
        return uspesno;
    }

    public void setUspesno(boolean uspesno) {
        this.uspesno = uspesno;
    }
    
    
    

}
