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
 * @author Alejandro De la Rosa Cosano - IES Sotero Hernandez
 *
 */
public class App {
	
	/** Logger CHIVATO (Genera un conjunto de registros en la ruta especificada) */
	private static final Logger CHIVATO = LoggerFactory.getLogger("padre");
	
	/**	Logger CHIVATO1  (Imprime los logs correspondientes por consola, exclusivamente) */
	private static final Logger CHIVATO1 = LoggerFactory.getLogger("hijo");

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		CHIVATO1.info("Proceso iniciado");
		
		/** Lista para almacenar nombres */		
		CHIVATO.debug("Creación de una lista");
		
		List<String> lista = new ArrayList<>();
		
		
		/** Generacion nombres falsos */
		Faker nombre = new Faker();

		for (int i = 0; i < 1500; i++) {
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
		
		CHIVATO.debug("Proceso finalizado");
		CHIVATO1.info("Proceso finalizado");

	}
}
