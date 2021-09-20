package rs.ac.bg.fon.ai.domen;

import java.io.Serializable;
import java.util.Objects;
/**
*
* Klasa koja predstavlja Trenera aplikacije TreningCentar .
* 
* Trener ima id kao int, korisnickoIme i sifru kao String vrednosti.
* 
* @author Milena
*/

public class Trener implements Serializable{
	/**
	 * tid kao int vrednost.
	 */
    private int tid;
    /**
	 * korisnickoIme kao String vrednost.
	 */
    private String korisnickoIme;
    /**
	 * sifra kao String vrednost.
	 */
    private String sifra;
    /**
     * Konstruktor koji inicijalizuje objekat i nista vise.
     */
 
    public Trener() {
    }
    
    /**
     * Konstruktor koji inicijalizuje objekat i postavlja vrednosti tid, korisnickoIme i sifra na nove vrednosti.
     * 
     * @param tid Id trenera kao int.
     * @param korisnickoIme Korisnicko ime trenera kao String vrednost.
     * @param sifra Sifra trenera kao String vrednost.
     */
    public Trener(int tid, String ime, String sifra) {
        this.tid = tid;
        this.korisnickoIme = ime;
        this.sifra = sifra;
       
    }

    /**
     * Vraca id trenera.
     * 
     * @return  tid Id trenera kao int.
     */

    public int getTid() {
        return tid;
    }

    /**
     * Postavlja id trenera na novu vrednost.
     * 
     * @param  tid Id trenera kao int.
     */
    public void setTid(int tid) {
        this.tid = tid;
    }
    /**
     * Vraca korisnickoIme trenera.
     * 
     * @return  korisnickoIme Korisnicko ime trenera kao String vrednost.
     */
    public String getKorisnickoIme() {
        return korisnickoIme;
    }
    /**
     * Postavlja korisnicko ime trenera na novu vrednost.
     * 
     * @param  korisnickoIme Korisnicko ime trenera kao String vrednost.
     */
    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }
    /**
     * Vraca sifru trenera.
     * 
     * @return sifra Sifra trenera kao String vrednost.
     */
    public String getSifra() {
        return sifra;
    }
    /**
     * Postavlja sifru trenera na novu vrednost.
     * 
     * @param  sifra Sifra trenera kao String vrednost.
     */
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



