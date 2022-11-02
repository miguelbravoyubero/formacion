package com.miguelbravoyubero.formacion.financiera;

import com.miguelbravoyubero.formacion.matematicas.Calculadora;

public class CalculadoraFinanciera {

	public static double sumarImportes (double ... importes) {
		
		double total = 0;
		
		for (double importe: importes) {
		
			//total += importe;
			total = Calculadora.sumar(total, importe);
		}
		
		return total;
	}
	
	public static double restarImportes (double ...importes) {
		double total = 0;
		
		for (double importe: importes) {
			total = Calculadora.restar(total, importe);
		}
		
		return total;
	}
}
