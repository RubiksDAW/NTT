package nttdata.javat4.businesss;
/**
 * Clase Estudiante
 * @author Alejandro-NTT
 *
 */
public class Student {

	private int id;
	private String name;
	private String english;
	private static int COUNT = 1;
	
	/**
	 * Contructor de la clase Estudiante
	 * @param name Nombre del Estudiante
	 * @param english Nivel de ingles del Estudiante
	 */
	public Student(String name, String english) {
		this.id = COUNT;
		COUNT++;
		this.name = name;
		this.english = english;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public int getID() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", english=" + english + "]";
	}

}
