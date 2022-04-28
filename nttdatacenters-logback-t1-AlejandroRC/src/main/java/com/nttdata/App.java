package com.nttdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;
import com.github.javafaker.Faker;

/**
 * Formación - SLF4J + Logback - Taller Practico
 * 
 * Clase principal
 * 
 * @author Alejandro De la Rosa Cosano -IES Sotero Hernandez
 *
 */
public class App {
	
	/** Logger */
	private static final Logger CHIVATO = LoggerFactory.getLogger(App.class);

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		/** Lista para almacenar nombres */		
		CHIVATO.debug("Creación de una lista");
		
		List<String> lista = new ArrayList<>();
		
		
		/** Generacion nombres falsos */
		Faker nombre = new Faker();

		for (int i = 0; i < 2000; i++) {
			String name = nombre.name().fullName();
			lista.add(name);
			CHIVATO.debug("Nombre generado:{}, id:{}",name,i);
		}
		
		CHIVATO.debug("Nombres añadidos");

		Iterator<String> iter = lista.iterator();
		while (iter.hasNext()) {

			String elem = iter.next();
			CHIVATO.info("Elemento de la lista: {}", elem);

		}

	}
}
