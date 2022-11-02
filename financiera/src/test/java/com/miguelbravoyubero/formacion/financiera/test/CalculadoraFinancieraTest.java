package com.miguelbravoyubero.formacion.financiera.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.miguelbravoyubero.formacion.financiera.CalculadoraFinanciera;

public class CalculadoraFinancieraTest {

	@Test
	public void test() {

		assertEquals(10.0, CalculadoraFinanciera.sumarImportes(3,4,3), 0);
	}

}