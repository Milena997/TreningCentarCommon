package rs.ac.bg.fon.ai.domen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrenerTest {
public Trener t;
	@BeforeEach
	void setUp() throws Exception {
		t= new Trener();
	}

	@AfterEach
	void tearDown() throws Exception {
		t=null;
	}

	@Test
	void testTrener() {
		t= new Trener();
		assertNotNull(t);
	}

	@Test
	void testTrenerIntStringString() {
		t= new Trener(1, "marko", "m");
		
		assertNotNull(t);
		assertEquals(1, t.getTid());
		assertEquals("marko", t.getKorisnickoIme());
		assertEquals("m", t.getSifra());
	}

	@Test
	void testSetTid() {
		t.setTid(1);
		assertEquals(1, t.getTid());
	}

	@Test
	void testSetKorisnickoIme() {
		t.setKorisnickoIme("Mara");
		assertEquals("Mara", t.getKorisnickoIme());
	}
	

	@Test
	void testSetKorisnickoImeNull() {
	
	assertThrows(java.lang.NullPointerException.class, () -> t.setKorisnickoIme(null));
	}
	
	@Test
	void testSetKorisnickoImeEmpty() {
	
		assertThrows(java.lang.RuntimeException.class, () -> t.setKorisnickoIme(""));
	}
	
	

	@Test
	void testSetSifra() {
		t.setSifra("m");
		assertEquals("m", t.getSifra());
	}

	
	@Test
	void testSetSifraNull() {
		assertThrows(java.lang.NullPointerException.class, () -> t.setSifra(null));
	}
	
	@Test
	void testSetSifraEmpty() {
		assertThrows(java.lang.RuntimeException.class, () -> t.setSifra(""));
	}

	@Test
	void testToString() {
		t.setKorisnickoIme("Mara");
		String s= t.toString();
		assertTrue(s.contains("Mara"));
	}

}
