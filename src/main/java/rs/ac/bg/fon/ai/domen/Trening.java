package rs.ac.bg.fon.ai.domen;

import java.io.Serializable;
/**
*
* Klasa koja predstavlja Trening aplikacije TreningCentar .
* 
* Trening ima id kao int, trenera kao Trener,polaznika kao Polaznik, vrstu vezbe kao VrstaVezbe, grad kao Grad,clanarinu kaoClanarina i salu kao Sala vrednost.

*@author Milena
*/
public class Trening implements Serializable {
	/**
	 * trid kao int vrednost.
	 */
    private int trid;
    /**
	 * trener kao Trener vrednost.
	 */
    private Trener trener;
    /**
	 * polaznik kao Polaznik vrednost.
	 */
    private Polaznik polaznik;
    /**
	 * vv kao VrstaVezbe vrednost.
	 */
    private VrstaVezbe vv;
    /**
	 * grad kao Grad vrednost.
	 */
    private Grad grad;
    /**
	 * clanarina kao Clanarina vrednost.
	 */
    private Clanarina clanarina;
    /**
	 * sala kao Sala vrednost.
	 */
    private Sala sala;
    
    /**
     * Konstruktor koji inicijalizuje objekat i nista vise.
     */
    public Trening() {
    }
    /**
     * Konstruktor koji inicijalizuje objekat i postavlja vrednosti trid,trener, polaznik,vv,grad,clanarina,sala na nove vrednosti.
     * 
     * @param trid Id treninga kao int.
     * @param trener Trener koji je zaduzen za trening kao Trener vrednost.
     * @param polaznik Polaznik treninga kao Polaznik vrednost.
     * @param vv Vrsta vezbe treninga  kao VrstaVezbe vrednost.
     * @param grad Grad u kome se odrzava trening kao Grad vrednost.
     * @param clanarina Clanarina treninga kao Clanarina vrednost.
     * @param sala Sala treninga kao Sala vrednost.
     * 
     */
    public Trening(int trid, Trener trener, Polaznik polaznik, VrstaVezbe vv, Grad grad, Clanarina clanarina, Sala sala) {
        this.trid = trid;
        this.trener = trener;
        this.polaznik = polaznik;
        this.vv = vv;
        this.grad = grad;
        this.clanarina = clanarina;
        this.sala = sala;
    }

    
    /**
     * Vraca id treninga.
     * 
     * @return trid Id treninga kao int.
     */
    
    public int getTrid() {
        return trid;
    }
    /**
     * Postavlja id treninga na novu vrednost.
     * 
     * @param trid Id treninga kao int.
     */

    public void setTrid(int trid) {
        this.trid = trid;
    }
    /**
     * Vraca trenera treninga.
     * 
     * @return  trener Trener koji je zaduzen za trening kao Trener vrednost.
     
     */
    
    public Trener getTrenenr() {
        return trener;
    }
    /**
     * Postavlja trenera treninga na novu vrednost.
     * 
     * @param trener Trener koji je zaduzen za trening kao Trener vrednost.
     */

    public void setTrenenr(Trener trener) {
        this.trener = trener;
    }
    /**
     * Vraca polaznika treninga.
     * 
     * @return polaznik Polaznik treninga kao Polaznik vrednost.
     */
    public Polaznik getPolaznik() {
        return polaznik;
    }
    /**
     * Postavlja polaznika treninga na novu vrednost.
     * 
     * @param polaznik Polaznik treninga kao Polaznik vrednost.
     */

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }
    /**
     * Vraca grad treninga.
     * 
     * @return grad Grad u kome se odrzava trening kao Grad vrednost.
     */
    public Grad getGrad() {
        return grad;
    }
    /**
     * Postavlja grad treninga na novu vrednost.
     * 
     * @param grad Grad u kome se odrzava trening kao Grad vrednost.
     */

    public void setGrad(Grad grad) {
        this.grad = grad;
    }
    /**
     * Vraca vrstu vezbe treninga.
     * 
     * @return  vv Vrsta vezbe treninga  kao VrstaVezbe vrednost.
     */
    public VrstaVezbe getVv() {
        return vv;
    }
    /**
     * Postavlja vrsu vezbe treninga na novu vrednost.
     * 
     * @param  vv Vrsta vezbe treninga  kao VrstaVezbe vrednost.
     */

    public void setVv(VrstaVezbe vv) {
        this.vv = vv;
    }
    /**
     * Vraca clanarinu treninga.
     * 
     * @return clanarina Clanarina treninga kao Clanarina vrednost.
     */
    public Clanarina getClanarina() {
        return clanarina;
    }
    /**
     * Postavlja clanarinu treninga na novu vrednost.
     * 
     * @param clanarina Clanarina treninga kao Clanarina vrednost.
     */

    public void setClanarina(Clanarina clanarina) {
        this.clanarina = clanarina;
    }
    /**
     * Vraca salu treninga.
     * 
     * @return sala Sala treninga kao Sala vrednost.
     */
    public Sala getSala() {
        return sala;
    }
    /**
     * Postavlja salu treninga na novu vrednost.
     * 
     * @param sala Sala treninga kao Sala vrednost.
     */

    public void setSala(Sala sala) {
        this.sala = sala;
    }


}


