package nttdata.javat2.business;

/**
 * 
 * @author Alejandro-NTT
 *
 */
public class Employee {

	private int id;
	private String name;
	private String category;
	private final static String BUSINESSNAME = "NttData";
	//Haciendo static esta variable la hacemos de clase no de instancia.
	//Cuando declaras variables estáticas en una clase puedes acceder a ellas desde cualquier parte sin crear un objeto de ella
	private static int COUNT = 1;
	
	/**Constructor por defecto*/
	public Employee() {
		
		this.id = COUNT;
		//De esta forma logramos que se incrementen las id de los empleados sin tener que instanciar nuevo objeto empleado.
		COUNT++;
		
	}

	/**
	 * Constructor principal
	 * @param name
	 * @param category
	 */
	public Employee(String name, String category) {

		this.name = name;
		this.category = category;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBUSINESSNAME() {
		return BUSINESSNAME;
	}

	@Override
	public String toString() {
		return " "+ id + " " + name + " " + category + " " + getBUSINESSNAME();
	}

	
	
	

}
