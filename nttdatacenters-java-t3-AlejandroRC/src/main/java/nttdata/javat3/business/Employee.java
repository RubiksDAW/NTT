package nttdata.javat3.business;

/**
 * Clase Empleado que hereda de la clase Persona
 * 
 * @author Alejandro-NTT
 *
 */
public class Employee extends Person {
	
	/* Variable tipo String que almacena la Categoria del empleado */
	private String category;
	
	/* Variable tipo String que almacena el Proyecto del empleado */
	private String project;

	/* Constructor por defecto de Empleado */
	public Employee() {
		super();

	}

	/* Constructor sobrecargado de Empleado */
	public Employee(int dni, String name, String category, String project) {
		super(dni, name);
		this.category = category;
		this.project = project;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Empleado [Categoria: " + category + ", Proyecto: " + project + ", Dni: " + getDni() + ", Nombre: "
				+ getName() + "]";
	}

	/*	Metodo que devuelve las propiedades de Empleado */
	@Override
	public String showDetails() {
		
		return "Empleado [Categoria: " + category + ", Proyecto: " + project + ", Dni: " + getDni() + ", Nombre: "
				+ getName() + "]";
	}
	
	

}
