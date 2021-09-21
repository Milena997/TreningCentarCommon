package rs.ac.bg.fon.ai.domen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreningTest {

	public Trening t;
	Date d = new Date();
	Trener r = new Trener(2, "milos", "m");
	Polaznik p = new Polaznik(3, "Ana Antic", "zenski", d, "0665469", "G2");
	Clanarina c = new Clanarina(4, 2500, TipClanarine.MESECNA);
	
	@BeforeEach
	void setUp() throws Exception {
		t = new Trening();
		
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		t = null;

	}

	@Test
	void testTrening() {
		t = new Trening();
		assertNotNull(t);
	}

	@Test
	void testTreningIntTrenerPolaznikVrstaVezbeGradClanarinaSala() {

		Date d = new Date();
		int id = 1;
		Trener r = new Trener(2, "milos", "m");
		Polaznik p = new Polaznik(3, "Ana Antic", "zenski", d, "0665469", "G2");
		Clanarina c = new Clanarina(4, 2500, TipClanarine.MESECNA);

		t = new Trening(id, r, p, VrstaVezbe.full_program, Grad.BEOGRAD, c, Sala.SALA1);

		assertNotNull(t);
		assertEquals(id, t.getTrid());
		assertEquals(r, t.getTrenenr());
		assertEquals(p, t.getPolaznik());
		assertEquals(VrstaVezbe.full_program, t.getVv());
		assertEquals(Grad.BEOGRAD, t.getGrad());
		assertEquals(c, t.getClanarina());
		assertEquals(Sala.SALA1, t.getSala());

	}

	@Test
	void testSetTrid() {
		t.setTrid(1);
		assertEquals(1, t.getTrid());
	}

	@Test
	void testSetTrenenr() {
		t.setTrenenr(r);
		assertEquals(r, t.getTrenenr());
	}

	@Test
	void testSetPolaznik() {
		t.setPolaznik(p);
		assertEquals(p, t.getPolaznik());
	}

	@Test
	void testSetGrad() {
		t.setGrad(Grad.BEOGRAD);
		assertEquals(Grad.BEOGRAD,t.getGrad());
	}

	@Test
	void testSetVv() {
		t.setVv(VrstaVezbe.full_program);
		assertEquals(VrstaVezbe.full_program,t.getVv());
	}

	@Test
	void testSetClanarina() {
		t.setClanarina(c);
		assertEquals(c, t.getClanarina());
	}

	@Test
	void testSetSala() {
		t.setSala(Sala.SALA1);
		assertEquals(Sala.SALA1,t.getSala());
	}

}
