package nttdata.javat4.businesss;
/**
 * Interfaz ManagementServiceI implementada por la clase ManagementServiceImpl
 * @author Alejandro-NTT
 *
 */
public interface ManagementServiceI {
	
	/**
	 * Crea un Estudiante y lo añade o lo actualiza en el mapa de Estudiantes (students)
	 * @param name Nombre del Estudiante
	 * @param english Nivel de ingles del Estudiante
	 */
	public void addOrUpdateStudent(String name, String english);
	
	/**
	 * Crea un Instituto y lo añade o lo actualiza en el mapa de Institutos (schools)
	 * @param name
	 * @param modality
	 * @param city
	 */
	public void addOrUpdateSchool(String name, String modality, String city);
	
	/**
	 * Comprueba si un Estudiante se encuentra en el mapa (students) y lo añade al mapa asociado a un instituto , 
	 * de no estar en el mapa (students) lo crea y lo añade directamente al mapa asocidado al instituto
	 * @param id Identificador del Estudiante
	 * @param name Nombre del Estudiante 
	 * @param english Nivel de ingles del Estudiante
	 * @param nameSchool Nombre del Instituto
	 * @throws Exception 
	 */
	public void addStudentToSchool(int id, String name, String english, String nameSchool) throws Exception;
	
	/**
	 * Elimina un Estudiante de un Instituto 
	 * @param id Identificador del Estudiante a eliminar
	 * @param nameSchool Nombre del Instituto al que pertenece el alumno
	 */
	public void removeStudentFromSchool(int id, String nameSchool);
	
	/**
	 * Elimina un Instituto del mapa (schools)
	 * @param nameSchool Nombre del Instituto a eliminar
	 */
	public void removeSchool(String nameSchool);
	
	/**
	 * Nos muestra todos los alumnos del Instituto seleccionado
	 * @param nameSchool Nombre del Instituto que queremos recorrer 
	 */
	public void showAllStudentsFromSchool(String nameSchool);

}
