package nttdata.javat2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nttdata.javat2.business.ManagmentServiceImpl;

/**
 * Clase principal
 * 
 * @author Alejandro-NTT
 *
 */
public class T2MainAlejandroRC {

	private static final Logger CHIVATO = LoggerFactory.getLogger("padre");

	public static void main(String[] args) {

		ManagmentServiceImpl x = new ManagmentServiceImpl();

		x.insertEmployee("Alejandro", "Programador");
		x.insertEmployee("Manuel", "Programador");
		x.insertEmployee("Maria", "Analista");
		x.insertEmployee("Gabriel", "Programador");
		x.insertEmployee("Jesus", "Analista");
		

		CHIVATO.debug("Usuarios añadidos con exito");

		x.showEmployees();

		System.out.println(" Numero de empleados total: ");
		x.countEmployee();

		System.out.println(" Buscamos un empleado por su nombre, en este caso Manuel");
		System.out.println(" Resultados obtenidos: ");
		x.searchEmployeeByName("Manuel");
		System.out.println('\n');
		
		System.out.println("Eliminamos un usuario por su id UNICO, en este caso el ID 3 corresponde a Maria ");
		System.out.println('\n');
		x.deleteEmployee(3);

		CHIVATO.debug("Usuario eliminado con exito");
		
		System.out.println("Volvemos a mostrar los empleados");
		x.showEmployees();

		System.out.println(" Numero de empleados total: ");
		x.countEmployee();
		
		System.out.println("Borramos los demas empleados");
		x.deleteEmployee(1);
		x.deleteEmployee(2);
		x.deleteEmployee(4);
		x.deleteEmployee(5);
		
		System.out.println("Ahora intentamos añadir mas de 5 empleados: ");
		
		x.insertEmployee("Alejandro", "Programador");
		x.insertEmployee("Manuel", "Programador");
		x.insertEmployee("Maria", "Analista");
		x.insertEmployee("Gabriel", "Programador");
		x.insertEmployee("Jesus", "Analista");
		x.showEmployees();
		x.insertEmployee("Manuela", "Analista");
	}

}
