package nttdata.javat2.business;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ManagmentServiceImpl implements ManagmentServicel {

	Map<Integer, Employee> database = new HashMap<>(5);
	StringBuilder str = new StringBuilder();

	@Override
	public void insertEmployee(String name, String category) {

		if (name != null && name != "" && category != null && category != "" && database.size() <= 5) {

			Employee a = new Employee();

			a.setCategory(category);

			a.setName(name);

			database.put(a.getId(), a);

		} else {

			System.err.println("Has introducido algun campo vacío");

		}

	}

	@Override
	public void showEmployees() {

		str.append(" ID / ");
		str.append("NAME / ");
		str.append("CATEGORY / ");
		str.append("BUSINESSNAME");
		str.append('\n');

		System.out.println(str);

		for (Integer key : database.keySet()) {

			System.out.println(database.get(key));
			System.out.println();

		}

	}

	@Override
	public void countEmployee() {

		System.out.println(" " + database.size());
		System.out.println('\n');
	}

	/**
	 * Metodo utilizado para buscar empleados por su nombre
	 * 
	 * @param name
	 */
	public void searchEmployeeByName(String name) {

		for (Integer key : database.keySet()) {

			if (Objects.equals(database.get(key).getName(), name)) {

				System.out.println(database.get(key));

			}

		}

	}

	/**
	 * Metodo utilizado para eliminar un empleado por su ID
	 * 
	 * @param id
	 */
	public void deleteEmployee(int id) {

		if (database.containsKey(id)) {

			database.remove(id);

		} else {
			
			System.out.println("No se ha encontrado el ID buscado");
		}

	}

}
