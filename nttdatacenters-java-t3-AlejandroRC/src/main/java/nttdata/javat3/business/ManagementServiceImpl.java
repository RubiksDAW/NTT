package nttdata.javat3.business;

import java.util.HashMap;
import java.util.Map;
/**
 * Clase ManagementServiceImpl que implementa la interfaz ManagementServiceI
 * @author Alejandro-NTT
 *
 */
public class ManagementServiceImpl implements ManagementServiceI{
	
	/*	Mapa utilizado para simular una BBDD */
	Map<Integer, Person> database = new HashMap<>();
	
	
	@Override
	public void insertPerson(boolean type, String name, int dni, String school, String modality, String project,
			String category) {
		
		if(type) {
			
			Person a = new Employee(dni,name,category,project);
			
			database.put(a.getDni(), a);
			
			
		}else if(!type){
			
			Person b = new Student(dni, name, school, modality);
			
			database.put(b.getDni(), b);
			
			
		}
		
	}
	
	@Override
	public void showAll() {
		
		for (Integer key : database.keySet()) {

			System.out.println(database.get(key));
			System.out.println();

		}
		
	}

	
	
	

}
