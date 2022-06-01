package nttdata.javat3.business;
/**
 * Interfaz a implementar por la clase ManagementServiceImpl
 * @author Alejandro-NTT
 *
 */
public interface ManagementServiceI {
	
	/**
	 * Metodo que genera una Persona (Estudiante o Empleado)
	 * @param type Especifica si es Empleado (true) o Estudiante (false)
	 * @param nombre Nombre de la persona
	 * @param dni Dni de la persona
	 * @param school Instituto del estudiante
	 * @param modality Modalidad del estudiante
	 * @param project Proyecto del empleado
	 * @param category Categoria del Empleado
	 */
	public void insertPerson(boolean type,String nombre, int dni, String school, String modality, String project, String category);
	
	/* Metodo que muestra todas las personas de la BBDD	 */
	public void showAll();
}
