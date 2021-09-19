package rs.ac.bg.fon.ai.domen;

import java.io.Serializable;

public class Clanarina implements Serializable{
    private int clanarinaID;
    private double iznos;
    private TipClanarine tc;

    public Clanarina() {
    }

    public Clanarina(int clanarinaID, double iznos, TipClanarine tc) {
        this.clanarinaID = clanarinaID;
        this.iznos = iznos;
        this.tc = tc;
    }

     

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public int getClanarinaID() {
        return clanarinaID;
    }

    public void setClanarinaID(int clanarinaID) {
        this.clanarinaID = clanarinaID;
    }

    public TipClanarine getTc() {
        return tc;
    }

    public void setTc(TipClanarine tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        return  tc + "";
    }

 
    
    

}
