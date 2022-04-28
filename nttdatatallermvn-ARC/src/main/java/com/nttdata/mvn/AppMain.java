package com.nttdata.mvn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.*;

public class AppMain {

	// Declaración de varibles

	private static List<String> nameList;
	private static String name;
	static Scanner sc = new Scanner(System.in);
	
	// Declaramos una variable tipo LocalDate correspondiente a la fecha actual
	
	static LocalDate date = LocalDate.now();
	
	
	
	// Método haciendo uso de la dependencia org.apache.commons.lang3

	public static void insertName(String name) {

		if (StringUtils.isBlank(name)) {

			System.out.println("Has introducido un nombre en blanco");

		} else {

			nameList.add(name);

		}

	}
	
	public static void inizializeArray() {
		
		
		if(nameList == null) {
			
			nameList = new ArrayList<>();
			
		}else {
			
			
			System.out.println("Ya has inicializado el array");
			
		}
		
		
	}

	public static void main(String[] args) {

		inizializeArray();
		
		System.out.println("BIENVENIDO TELLEZ, INTRODUCE TU ALINEACIÓN DE LA SEMANA");
		System.out.println("Primer jugador:");

		do {

			name = sc.nextLine();
			System.out.println("Dame otro jugador para tu equipo");
			insertName(name);

		} while (nameList.size() < 7);

		System.out.println("ESTA ES TU ALINEACIÓN A FECHA DE:"+date);
		
		// Recorremos la lista y mostramos en pantalla los nombres
		
		for (int i = 0; i < nameList.size(); i++) {

			System.out.println((i + 1) + ". " + nameList.get(i));

		}
		// Hacemos uso de la segunda dependencia utilizada org.joda.time
		
		System.out.println("PROXIMA RENOVACIÓN DE LA PLANTILLA:"+date.plusYears(1));

	}

}
