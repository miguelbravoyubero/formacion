package com.miguelbravoyubero.formacion.matematicas;

public class Calculadora {

	public static double sumar (double a, double b) {
		return a + b;
	}
	
	public static double restar (double a, double b) {
		return a - b;
	}
	
	public static double sumarImportes (double ... importes) {
		
		double total = 0;
		
		for (double importe: importes) {
		
			//total += importe;
			total = Calculadora.sumar(total, importe);
		}
		
		return total;
	}
}
