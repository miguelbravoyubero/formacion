package com.miguelbravoyubero.formacion.spring.servicios;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		contexto.register(SpringConfigurador.class);
		contexto.refresh();
		
		Servicio miServicio = contexto.getBean(Servicio.class);
		System.out.println(miServicio.mensaje());
		
		contexto.close();
		
	}
}
