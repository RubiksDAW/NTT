package nttdata.javat4;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nttdata.javat4.businesss.ManagementServiceImpl;

/**
 * Clase principal
 * 
 * @author Alejandro-NTT
 *
 */
public class T4MainARC {
	/**
	 * Método principal
	 * 
	 * @param args
	 */

	private static final Logger CHIVATO = LoggerFactory.getLogger("padre");

	public static void main(String[] args) {

		ManagementServiceImpl x = new ManagementServiceImpl();
		Scanner sc = new Scanner(System.in);
		// Creamos varios institutos
		x.addOrUpdateSchool("IES Sotero", "DAM", "Sevilla");
		x.addOrUpdateSchool("CSUR", "DAW", "Malaga");
		x.addOrUpdateSchool("IES Campanillas", "DAM", "Sevilla");
		x.addOrUpdateSchool("Salesianas", "DAM", "Sevilla");

		// Creamos unos cuantos alumnos
		x.addOrUpdateStudent("Alejandro", "C1");
		x.addOrUpdateStudent("Manuel", "C2");
		x.addOrUpdateStudent("Mario", "B2");
		x.addOrUpdateStudent("Valentina", "A2");

		// Insertamos un alumno ya existente al instituto Salesianas
		try {

			x.addStudentToSchool(1, null, null, "Salesianas");

		} catch (Exception e) {

			CHIVATO.debug("Has introducido un valor incorrecto");

		}

		// Tratamos de insertar el mismo alumno otra vez

		try {
			
			x.addStudentToSchool(1, null, null, "Salesianas");
			
		} catch (Exception e) {
			
			CHIVATO.debug("Has introducido un valor incorrecto");
		}

		x.showAllStudentsFromSchool("Salesianas");

		// Creamos e insertamos un nuevo alumno en el instituto Salesianas
		try {

			x.addStudentToSchool(0, "Martina", "C2", "Salesianas");

		} catch (Exception e) {

			CHIVATO.debug("Has introducido un valor incorrecto");

		}

		x.showAllStudentsFromSchool("Salesianas");

		// Eliminamos a Martina del intituto Salesianas
		try {

			x.removeStudentFromSchool(5, "Salesianas");

		} catch (Exception e) {

			CHIVATO.debug("Has introducido un valor incorrecto");

		}

		x.showAllStudentsFromSchool("Salesianas");
	}

}
