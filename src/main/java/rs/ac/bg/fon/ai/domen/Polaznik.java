package rs.ac.bg.fon.ai.domen;

import java.io.Serializable;
import java.util.Date;


public class Polaznik implements Serializable {
	   

    private int pid;
  
 private String imePrezime;

 private String pol;
 
   private Date datumRodj;
   
 private String tel;

 private String adresa;
 
   public Polaznik() {
   }
  
   public Polaznik(int pid, String ime, String pol, Date datumRodj, String tel,  String adresa) {
       this.pid = pid;
       this.imePrezime= ime;
     
       this.pol = pol;
       this.datumRodj = datumRodj;
       this.tel = tel;
      
       this.adresa = adresa;
   }


   public int getPid() {
       return pid;
   }
 

   public void setPid(int pid) {
       this.pid = pid;
   }

   public String getIme() {
       return imePrezime;
   }

   public void setIme(String ime) {
       this.imePrezime = ime;
   }

  

   public String getTel() {
       return tel;
   }
 
   public void setTel(String tel) {
       this.tel = tel;
   }

 

   public String getAdresa() {
       return adresa;
   }

   public void setAdresa(String adresa) {
       this.adresa = adresa;
   }


   public String getPol() {
       return pol;
   }

   public void setPol(String pol) {
       this.pol = pol;
   }
  
   public Date getDatumRodj() {
       return datumRodj;
   }
 
   public void setDatumRodj(Date datumRodj) {
       this.datumRodj = datumRodj;
   }

   @Override
   public String toString() {
       return  imePrezime + "";
   }
 

}
