package rs.ac.bg.fon.ai.domen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PolaznikTest {
public Polaznik p;
	@BeforeEach
	void setUp() throws Exception {
		p= new Polaznik();
	}

	@AfterEach
	void tearDown() throws Exception {
		p=null;
	}

	@Test
	void testPolaznik() {
		p = new Polaznik();
		assertNotNull(p);
	}

	@Test
	void testPolaznikIntStringStringDateStringString() {
		Date d= new Date();
		p= new Polaznik(1, "Mara Maric", "zenski", d,"065789456", "Kralja Petra I 3");
		
		assertNotNull(p);
		assertEquals(1, p.getPid());
		assertEquals( "Mara Maric", p.getIme());
		assertEquals("zenski", p.getPol());
		assertEquals(d, p.getDatumRodj());
		assertEquals("065789456",p.getTel());
		assertEquals( "Kralja Petra I 3", p.getAdresa());
		
	}

	@Test
	void testSetPid() {
		p.setPid(1);
		assertEquals(1, p.getPid());
	}

	@Test
	void testSetIme() {
	p.setIme("Mara Maric");
		assertEquals("Mara Maric", p.getIme());
	}

	@Test
	void testSetImeNull() {
	
	assertThrows(java.lang.NullPointerException.class, () -> p.setIme(null));
	}
	
	@Test
	void testSetImeEmpty() {
	
		assertThrows(java.lang.RuntimeException.class, () -> p.setIme(""));
	}
	
	@Test
	void testSetTel() {
		p.setTel("066123");
		assertEquals("066123", p.getTel());
	}
	
	@Test
	void testSetTelNull() {
	
	assertThrows(java.lang.NullPointerException.class, () -> p.setTel(null));
	}
	
	@Test
	void testSetTelEmpty() {
	
		assertThrows(java.lang.RuntimeException.class, () -> p.setTel(""));
	}
	

	@Test
	void testSetAdresa() {
		p.setAdresa("K 20");
		assertEquals("K 20", p.getAdresa());
	}
	
	@Test
	void testSetAdresaNull() {
	
	assertThrows(java.lang.NullPointerException.class, () -> p.setAdresa(null));
	}
	
	@Test
	void testSetAdresaEmpty() {
	
		assertThrows(java.lang.RuntimeException.class, () -> p.setAdresa(""));
	}

	@Test
	void testSetPol() {
		p.setPol("zenski");
		assertEquals("zenski", p.getPol());
	}

	@Test
	void testSetPolNull() {
	
	assertThrows(java.lang.NullPointerException.class, () -> p.setPol(null));
	}
	
	@Test
	void testSetPolEmpty() {
	
		assertThrows(java.lang.RuntimeException.class, () -> p.setPol(""));
	}

	
	@Test
	void testSetDatumRodj() {
		Date d= new Date();
		p.setDatumRodj(d);
		assertEquals(d, p.getDatumRodj());
	}

}
