package nttdata.javat4.businesss;

import java.util.HashMap;
import java.util.Map;
/**
 * Clase Instituto
 * @author Alejandro-NTT
 *
 */
public class School {

	private String name;
	private String modality;
	private String city;
	private Map<Integer, Student> studentList;
	StringBuilder str = new StringBuilder();
	/**
	 * Constructor principal de la clase Instituto
	 * @param name Nombre del centro 	
	 * @param modality Modalidad que imparte
	 * @param city Ciudad donde se localiza
	 */
	public School(String name, String modality, String city) {

		this.name = name;
		this.modality = modality;
		this.city = city;
		this.studentList = new HashMap<>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Metodo para insertar alumnos en el mapa asociado al centro
	 * @param a Estudiante a insertar
	 */
	public void insertStudent(Student a) {

		studentList.put(a.getID(), a);

	}
	
	/**
	 * Metodo para eliminar un alumno asociado al centro
	 * @param id Identificador del Estudiante
	 */
	public void deleteStudent(int id) {

		studentList.remove(id);

	}
	/**
	 * Recorre el mapa studentList y muestra los alumnos contenidos en el
	 */
	public void showStudents() {
		
		for (Integer key : studentList.keySet()) {
		     System.out.println(key +" : "+studentList.get(key));
		     
		}
		
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", modality=" + modality + ", city=" + city + ", studentList=" + studentList + "]";
	}

}
