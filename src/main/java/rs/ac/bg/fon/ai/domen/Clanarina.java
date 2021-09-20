package rs.ac.bg.fon.ai.domen;

import java.io.Serializable;

/**
*
* Klasa koja predstavlja Clanarinu aplikacije TreningCentar .
* 
* Clanarina ima id kao int i iznos kao double i tipClanarine kao enum TipClanarine.
* 
* @author Milena
*/

public class Clanarina implements Serializable{
	/**
	 * clanarinaID kao int vrednost.
	 */
    private int clanarinaID;
    /**
	 * iznos kao double vrednost.
	 */
    private double iznos;
    /**
	 * tc kao TipClanarine vrednost.
	 */
    private TipClanarine tc;
    /**
     * Konstruktor koji inicijalizuje objekat i nista vise.
     */
    public Clanarina() {
    }
    /**
     * Konstruktor koji inicijalizuje objekat i postavlja vrednosti clanarinaID,iznos i tc na nove vrednosti.
     * 
     * @param clanarinaID Id clanarine kao int.
     * @param iznos Iznos clanarine kao double vrednost.
     * @param tc Tip clanarine korisnika kao TipClanarine vrednost.
    */

    public Clanarina(int clanarinaID, double iznos, TipClanarine tc) {
        this.clanarinaID = clanarinaID;
        this.iznos = iznos;
        this.tc = tc;
    }

    /**
     * Vraca izos clanarine.
     * 
     * @return iznos Iznos clanarine kao double vrednost.
     */

    public double getIznos() {
        return iznos;
    }
    /**
     * Postavlja iznos clanarine na novu vrednost.
     * 
     * @param iznos Iznos clanarine kao double vrednost.
     */

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    /**
     * Vraca id clanarine.
     * 
     * @return clanarinaId Id clanarine kao int.
     */
    public int getClanarinaID() {
        return clanarinaID;
    }
    /**
     * Postavlja id clanarine na novu vrednost.
     * 
     * @param clanarinaID Id clanarine kao int.
     */

    public void setClanarinaID(int clanarinaID) {
        this.clanarinaID = clanarinaID;
    }

    /**
     * Vraca tip clanarine clanarine.
     * 
     * @return tc Tip clanarine korisnika kao TipClanarine vrednost.
     */
    public TipClanarine getTc() {
        return tc;
    }
    /**
     * Postavlja tip clanarine na novu vrednost.
     * 
     * @param tc Tip clanarine korisnika kao TipClanarine vrednost.
     */

    public void setTc(TipClanarine tc) {
    	if(tc==null) {
    		throw new NullPointerException("Enum ne sme biti null.");
    	}
        this.tc = tc;
    }

    @Override
    public String toString() {
        return  tc + "";
    }

 
    
    

}