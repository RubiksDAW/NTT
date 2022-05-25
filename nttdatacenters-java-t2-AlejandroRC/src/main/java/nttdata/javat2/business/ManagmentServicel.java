package nttdata.javat2.business;

/**
 * Interfaz utilizada por la clase ManagmentServiceImpl
 * 
 * @author Alejandro-NTT
 *
 */
public interface ManagmentServicel {

	/**
	 * Metodo para insertar en la bbdd un nuevo empleado 
	 * @param name
	 * @param category
	 */
	public void insertEmployee(String name, String category);

	/** Metodo utilizado para mostrar los empleados actuales que hay en nuestra bbdd */
	public void showEmployees();

	/** Metodo utilizado para contar el numero de empleados totales */
	public void countEmployee();

}
