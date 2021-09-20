package rs.ac.bg.fon.ai.domen;

import java.io.Serializable;

public class Trening implements Serializable {
	
    private int trid;
 
    private Trener trenenr;
   
    private Polaznik polaznik;
   
    private VrstaVezbe vv;
  
    private Grad grad;
   
    private Clanarina clanarina;
   
    private Sala sala;
    
  
    public Trening() {
    }
   
    public Trening(int trid, Trener trenenr, Polaznik polaznik, VrstaVezbe vv, Grad grad, Clanarina clanarina, Sala sala) {
        this.trid = trid;
        this.trenenr = trenenr;
        this.polaznik = polaznik;
        this.vv = vv;
        this.grad = grad;
        this.clanarina = clanarina;
        this.sala = sala;
    }

    
   
    
    public int getTrid() {
        return trid;
    }
   
    public void setTrid(int trid) {
        this.trid = trid;
    }
   
    
    public Trener getTrenenr() {
        return trenenr;
    }
    
    public void setTrenenr(Trener trenenr) {
        this.trenenr = trenenr;
    }
 
    public Polaznik getPolaznik() {
        return polaznik;
    }
  

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }
    
    public Grad getGrad() {
        return grad;
    }
  

    public void setGrad(Grad grad) {
        this.grad = grad;
    }
   
    public VrstaVezbe getVv() {
        return vv;
    }
   

    public void setVv(VrstaVezbe vv) {
        this.vv = vv;
    }
  
    public Clanarina getClanarina() {
        return clanarina;
    }
   

    public void setClanarina(Clanarina clanarina) {
        this.clanarina = clanarina;
    }
    
    public Sala getSala() {
        return sala;
    }
    

    public void setSala(Sala sala) {
        this.sala = sala;
    }


}
