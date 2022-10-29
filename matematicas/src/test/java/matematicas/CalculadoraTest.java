package matematicas;

import static org.junit.Assert.*;

import org.junit.Test;

import com.miguelbravoyubero.formacion.matematicas.Calculadora;

public class CalculadoraTest {

	@Test
	public void test() {
		
		// valor esperado
		// valor actual (operacion)
		// delta
		assertEquals(4, Calculadora.sumar(2, 2), 0.2);
	}

}
