package unitTest;

import org.junit.Test;
import calculadora.Persona;
public class CalcTest {

	
	// Especifica uma Expected que o Testador está esperando;
	@Test(expected=IllegalArgumentException.class)
	public void testDayIsNegativeGiveException() {
		Persona.fechaNacimiento(-10,0,0);
	}
	
	
	@Test(expected=IllegalArgumentException.class)// Especifica uma Expected que o Testador está esperando;
	public void testMonthIsNegativeGiveException() {
		Persona.fechaNacimiento(0,-10,0);
	}
	
	
	@Test(expected=IllegalArgumentException.class)// Especifica uma Expected que o Testador está esperando;
	public void testYearIsNegativeGiveException() {
		Persona.fechaNacimiento(0,0,-10);
	}
}

