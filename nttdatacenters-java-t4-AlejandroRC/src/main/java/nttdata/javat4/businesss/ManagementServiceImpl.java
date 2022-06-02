package nttdata.javat4.businesss;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

/**
 * Clase ManagementServiceImp que implementa la interfaz ManagementServiceI
 * 
 * @author Alejandro-NTT
 *
 */
public class ManagementServiceImpl implements ManagementServiceI {

	Map<String, School> schools = new HashMap<>();
	Map<Integer, Student> students = new HashMap<>();

	@Override
	public void addOrUpdateStudent(String name, String english) {

		if (!name.isEmpty() && !english.isEmpty()) {

			Student a = new Student(name, english);

			if (students.containsKey(a.getID())) {

				students.replace(a.getID(), a);

			} else {

				students.put(a.getID(), a);
				System.out.println(students.toString());
			}

		} else {

			System.out.println("Has introducido un campo en blanco");
		}

	}

	@Override
	public void addOrUpdateSchool(String name, String modality, String city) {

		if (!name.isBlank() && !modality.isBlank() && !city.isBlank()) {

			School b = new School(name, modality, city);

			if (schools.containsKey(name)) {

				schools.replace(name, b);

			} else {

				schools.put(name, b);

			}

		} else {

			System.out.println("Se ha introducido un campo en blanco");
		}

	}

	@Override
	public void addStudentToSchool(int id, String name, String english, String nameSchool)
			throws InputMismatchException {

		if (students.containsKey(id)) {

			schools.get(nameSchool).insertStudent(students.get(id));

		} else {

			System.out.println("No se ha encontrado el alumno, creando nuevo perfil...");
			Student z = new Student(name, english);
			schools.get(nameSchool).insertStudent(z);
			System.out.println("Nuevo alumno creado e insertado...");
		}

	}

	@Override
	public void removeStudentFromSchool(int id, String nameSchool) throws InputMismatchException {

		if (schools.containsKey(nameSchool)) {

			schools.get(nameSchool).deleteStudent(id);
			System.out.println("Usuario eliminado");

		} else {

			System.out.println("No se encuentra el usuario");
		}

	}

	@Override
	public void removeSchool(String nameSchool) {

		if (schools.containsKey(nameSchool)) {

			schools.remove(nameSchool);
			System.out.println("Instituto borrado");

		} else {

			System.out.println("No se ha encontrado el instituto");

		}

	}

	@Override
	public void showAllStudentsFromSchool(String nameSchool) {

		if (!nameSchool.isBlank()) {

			schools.get(nameSchool).showStudents();
			
		} else {

			System.out.println("Introduce un nombre valido");
			
		}

	}

}
