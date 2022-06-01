package nttdata.javat3.business;

/**
 * Clase Estudiante  que hereda de la Persona
 * 
 * @author Alejandro-NTT
 *
 */
public class Student extends Person {
	
	/* Variable tipo String que almacena el instituto del Estudiante */
	private String school;
	
	/* Variable tipo String que almacena la modalidad del Estudiante */
	private String modality;
	
	/* Contructor por defecto de Estudiante */
	public Student() {
		super();
		
	}
	
	/*	Constructor sobrecargado de Estudiante */
	public Student(int dni, String name, String school, String modality) {
		super(dni, name);
		this.school = school;
		this.modality = modality;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	@Override
	public String toString() {
		return "Estudiante [Colegio: " + school + ", Modalidad: " + modality + ", Dni: " + getDni() + ", Nombre: "
				+ getName() + "]";
	}

	/*	Metodo que devuelve las propiedades de Empleado */
	@Override
	public String showDetails() {
		
		return "Estudiante [Colegio: " + school + ", Modalidad: " + modality + ", Dni: " + getDni() + ", Nombre: "
				+ getName() + "]";
		
	}

	

	
}
