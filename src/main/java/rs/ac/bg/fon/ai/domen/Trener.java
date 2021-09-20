package rs.ac.bg.fon.ai.domen;

import java.io.Serializable;
import java.util.Objects;

public class Trener implements Serializable{

    private int tid;
  
    private String korisnickoIme;
 
    private String sifra;
   
    public Trener() {
    }
    
  
    public Trener(int tid, String ime, String sifra) {
        this.tid = tid;
        this.korisnickoIme = ime;
        this.sifra = sifra;
       
    }

  
    public int getTid() {
        return tid;
    }


    public void setTid(int tid) {
        this.tid = tid;
    }
 
    public String getKorisnickoIme() {
        return korisnickoIme;
    }
  
    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }
  
    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.korisnickoIme);
        hash = 53 * hash + Objects.hashCode(this.sifra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trener other = (Trener) obj;
        if (!Objects.equals(this.korisnickoIme, other.korisnickoIme)) {
            return false;
        }
        if (!Objects.equals(this.sifra, other.sifra)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + korisnickoIme;
    }

   

}
