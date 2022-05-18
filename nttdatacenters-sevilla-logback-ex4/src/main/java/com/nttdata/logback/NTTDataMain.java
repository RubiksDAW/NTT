package com.nttdata.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Formación - SLF4J + Logback - Ejemplo
 * 
 * Clase principal
 * 
 * @author NTT Data Sevilla
 *
 */
public class NTTDataMain {

	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(NTTDataMain.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.info("Inicio del método");

		// Iteración hasta N.
		for (int i = 0; i <= 5000; i++) {
			LOG.debug("Iteración número: {}", i);
		}

		LOG.info("Fin del método");
	}
}
