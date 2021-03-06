package rs.ac.bg.fon.ai.domen;

import java.io.Serializable;
import java.util.Date;

/**
*
* Klasa koja predstavlja Polaznika aplikacije TreningCentar .
* 
* 
*Polaznik ima id kao int, imePrezime,pol,telefon i adresu kao String i datum kaoDate vrednost.
*
*@author Milena
*/

public class Polaznik implements Serializable {
	   
	/**
	 * pID kao int vrednost.
	 */
    private int pid;
    /**
	 * imePrezime kao String vrednost.
	 */
 private String imePrezime;
 /**
	 * pol kao String vrednost.
	 */
 private String pol;
 /**
	 * datumRodj kao Date vrednost.
	 */
   private Date datumRodj;
   /**
 	 * tel kao String vrednost.
 	 */
 private String tel;
 /**
	 * adresa kao String vrednost.
	 */
 private String adresa;
 /**
  * Konstruktor koji inicijalizuje objekat i nista vise.
  */
   public Polaznik() {
   }
   /**
    * Konstruktor koji inicijalizuje objekat i postavlja vrednosti pid,imePrezime, po,datumRodj,tel,adresa na nove vrednosti.
    * 
    * @param pid Id polaznika kao int.
    * @param imePrezime Ime i prezime polaznika kao String vrednost.
    * @param pol Pol korisnika kao String vrednost.
    * @param datumRodj Datum rodjenja polaznika  kao Date vrednost.
    * @param tel Telefon polaznika kao String vrednost.
    * @param adresa Adresa polaznika kao String vrednost.
    * 
    */
   public Polaznik(int pid, String imePrezime, String pol, Date datumRodj, String tel,  String adresa) {
       this.pid = pid;
       this.imePrezime= imePrezime;
     
       this.pol = pol;
       this.datumRodj = datumRodj;
       this.tel = tel;
      
       this.adresa = adresa;
   }

   
   /**
    * Vraca id polaznika.
    * 
    * @return pid Id polaznika kao int.
    */
   public int getPid() {
       return pid;
   }
   /**
    * Postavlja id polaznika na novu vrednost.
    * 
    * @param pid Id polaznika kao int.
    */

   public void setPid(int pid) {
       this.pid = pid;
   }
   /**
    * Vraca ime i prezime polaznika.
    * 
    * @return imePrezime Ime i prezime polaznika kao String vrednost.
    */
   public String getIme() {
       return imePrezime;
   }
   /**
    * Postavlja ime i prezime polaznika na novu vrednost.
    * 
    * @param imePrezime Ime i prezime polaznika kao String vrednost.
    */
   public void setIme(String imePrezime) {
	   if(imePrezime==null) {
   		throw new NullPointerException("Ime i prezime ne smeju biti null.");
   	}
   	if(imePrezime.isEmpty()) {
   		throw new RuntimeException("Ime i prezime ne smeju biti prazan string.");
   	}
      
	   
	   
       this.imePrezime = imePrezime;
   }

  
   /**
    * Vraca tel polaznika.
    * 
    * @return tel Telefon polaznika kao String vrednost.
    */
   public String getTel() {
       return tel;
   }
   /**
    * Postavlja telefon polaznika na novu vrednost.
    * 
    * @param tel Telefon polaznika kao String vrednost.
    */
   public void setTel(String tel) {
	   if(tel==null) {
   		throw new NullPointerException("Telefon ne sme biti null.");
   	}
   	if(tel.isEmpty()) {
   		throw new RuntimeException("Telefon ne sme biti prazan string.");
   	}
      
       this.tel = tel;
   }

   /**
    * Vraca adresu polaznika.
    * 
    * @return adresa Adresa polaznika kao String vrednost.
    */

   public String getAdresa() {
       return adresa;
   }
   /**
    * Postavlja adresa polaznika na novu vrednost.
    * 
    * @param adresa Adresa polaznika kao String vrednost.
    */
   public void setAdresa(String adresa) {
	   if(adresa==null) {
   		throw new NullPointerException("Adresa ne sme biti null.");
   	}
   	if(adresa.isEmpty()) {
   		throw new RuntimeException("Adresa ne sme biti prazan string.");
   	}
       
       this.adresa = adresa;
   }
   /**
    * Vraca pol polaznika.
    * 
    * @return pol Pol korisnika kao String vrednost.
    */

   public String getPol() {
       return pol;
   }
   /**
    * Postavlja pol polaznika na novu vrednost.
    * 
    * @param pol Pol korisnika kao String vrednost.
    */
   public void setPol(String pol) {
	   if(pol==null) {
   		throw new NullPointerException("Pol ne sme biti null.");
   	}
   	if(pol.isEmpty()) {
   		throw new RuntimeException("Pol ne sme biti prazan string.");
   	}
       
       this.pol = pol;
   }
   /**
    * Vraca datum rodjenja polaznika.
    * 
    * @return datumRodj Datum rodjenja polaznika  kao Date vrednost.
    */
   public Date getDatumRodj() {
       return datumRodj;
   }
   /**
    * Postavlja datum rodjenja polaznika na novu vrednost.
    * 
    * @param datumRodj Datum rodjenja polaznika  kao Date vrednost.
    */
   public void setDatumRodj(Date datumRodj) {
       this.datumRodj = datumRodj;
   }

   @Override
   public String toString() {
       return  imePrezime + "";
   }
 

}

