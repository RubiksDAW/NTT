package com.nttdata.mvn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.NameList;

/**
 * @Alejandro
 *
 */
public class App {
	
	String name;
	String answer;
	List<String> nameList = new ArrayList<>();

	public static void insertName(String name) {
		
		if(StringUtils.isBlank(name)) {
			
			System.out.println("Has añadido un campo en blanco, no se registrará en tu equipo");
			
			
		}
		
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {

		// CREAMOS UNA VARIABLE PARA ALMACENAR EL NOMBRE
		
		

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("¿ QUIERES CREAR UN EQUIPO DE FUTBOL ?");

		answer = sc.nextLine();

		if (answer.equalsIgnoreCase("si")) {

			do {

				System.out.println("Introduce tu nombre");


				name = sc.nextLine();
				
				// COMPROBAMOS QUE LA VARIABLE NO ESTÉ VACÍA

				if (StringUtils.isBlank(name)) {

					do {

						System.out.println("Has dejado en blanco tu nombre, por favor rellenalo");

						name = sc.nextLine();

					} while ((StringUtils.isBlank(name)));

				} else {

					if (!(name.equalsIgnoreCase("fin"))) {

						nameList.add(name);

					}

				}

			} while (!(name.equalsIgnoreCase("fin")));

			System.out.println("ESTOS SON LOS MIEMBROS DE TU EQUIPO");

			for (int i = 0; i < nameList.size(); i++) {

				System.out.println(nameList.get(i));

			}

		} else {

			System.out.println("Adiós");

		}

	}
}
