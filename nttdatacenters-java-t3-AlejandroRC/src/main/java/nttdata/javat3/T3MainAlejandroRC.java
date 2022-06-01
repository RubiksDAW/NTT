package nttdata.javat3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import nttdata.javat3.business.*;

/**
 * Clase Main del ejercicio
 * 
 * @author Alejandro-NTT
 *
 */
public class T3MainAlejandroRC {
	/*	Logger utilizado para registrar datos */
	private static final Logger CHIVATO = LoggerFactory.getLogger("padre");

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ManagementServiceImpl x = new ManagementServiceImpl();

		x.insertPerson(true, "Alejandro", 3232, null, null, "ProjectX", "Programador");

		CHIVATO.debug("Persona insertada");

		x.insertPerson(false, "Maria", 2323, "IES Sotero", "DAW", null, null);

		CHIVATO.debug("Persona insertada");

		x.insertPerson(false, "Juan", 1212334, "CSUR Sevilla", "DAM", null, null);

		x.insertPerson(true, "Ignacio", 243532, null, null, "ProjectX", "Analista");

		x.showAll();

		// Ponemos en practica el metodo showDetails()

		Person b = new Student(12345, "Alex", "IES Sotero", "DAW");

		CHIVATO.debug("Estudiante creado{}", b);

		System.out.println(b.showDetails());

		Person c = new Employee(23242, "Manuel", "Programador", "ProjectX");

		CHIVATO.debug("Empleado creado{}", c);

		System.out.println(c.showDetails());

	}

}
