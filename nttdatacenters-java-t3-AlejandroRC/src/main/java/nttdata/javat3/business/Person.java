package nttdata.javat3.business;
/**
 * Clase abstracta Persona 
 * @author Alejandro-NTT
 *
 */
public abstract class Person {

	private int dni;
	private String name;
	
	
	Person() {

	}

	Person(int dni, String name) {
		
		this.dni = dni;
		this.name = name;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [dni=" + dni + ", name=" + name + "]";
	}
	
	/**
	 * Metodo que devuelve la informacion de la clase Persona
	 * @return
	 */
	public String showDetails() {
		
		return "Person [dni=" + dni + ", name=" + name + "]";
		
	}
	
	

}
