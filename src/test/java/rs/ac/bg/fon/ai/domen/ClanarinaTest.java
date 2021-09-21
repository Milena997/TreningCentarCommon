package rs.ac.bg.fon.ai.domen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClanarinaTest {
	public Clanarina c;
	@BeforeEach
	void setUp() throws Exception {
		c= new Clanarina();
	}

	@AfterEach
	void tearDown() throws Exception {
		c= null;
	}

	@Test
	void testClanarina() {
		c = new Clanarina();
		assertNotNull(c);
	}

	@Test
	void testClanarinaIntDoubleTipClanarine() {
		c= new Clanarina(1, 2500, TipClanarine.MESECNA);
		
		assertNotNull(c);
		assertEquals(TipClanarine.MESECNA, c.getTc());
		assertEquals(2500, c.getIznos());
		assertEquals(1, c.getClanarinaID());
	
		
	}


	@Test
	void testSetIznos() {
		c.setIznos(2500);;
		assertEquals(2500, c.getIznos());
	}

	@Test
	void testSetClanarinaID() {
	c.setClanarinaID(1);
		assertEquals(1, c.getClanarinaID());
	}

	@Test
	void testSetTc() {
	c.setTc(TipClanarine.DNEVNA);
	assertEquals(TipClanarine.DNEVNA, c.getTc());
	}

	@Test
	void testToString() {
		c.setTc(TipClanarine.GODISNJA);
		String s= c.toString();
		assertTrue(s.contains("GODISNJA"));
	}

}
