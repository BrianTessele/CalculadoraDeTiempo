package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import calculadora.Persona;


public class CalcTest {

	
	// Especifica uma Expected que o Testador est� esperando;
	@Test(expected=IllegalArgumentException.class)
	public void testDayIsNegativeGiveException() {
		Persona.fechaNacimiento(-10,0,0);
	}
	
	
	@Test(expected=IllegalArgumentException.class)// Especifica uma Expected que o Testador est� esperando;
	public void testMonthIsNegativeGiveException() {
		Persona.fechaNacimiento(0,-10,0);
	}
	
	
	@Test(expected=IllegalArgumentException.class)// Especifica uma Expected que o Testador est� esperando;
	public void testYearIsNegativeGiveException() {
		Persona.fechaNacimiento(0,0,-10);
	}
	
	
	@Test
    public void testSetIdade()
    {
        // Implementa m�todo de teste unit�rio: Idade
        Persona p2 = new Persona();
        Persona.fechaNacimiento(0,0,1991);
        
        double expected = 26;
		double actual = p2.tieneEdad();
		
		assertEquals(expected, actual, 0.1);
      
	}
	
}

