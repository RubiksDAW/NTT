package com.nttdata.mvn;

import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 * Clase que solicita nombres de futbolistas para generar una plantilla PDF
 * 
 * @author Alejandro-NTT
 * @version 2.0
 */
public class App {

	/** Array de Strings para almacenar nombres */
	private static String[] nameList = new String[8];

	/** Variable String para recoger los nombres introducidos por los usuarios */
	private static String name;

	/** Variable Scanner a traves de la cual el usuario introducira los datos */
	private static Scanner sc = new Scanner(System.in);

	/** Variable auxiliar tipo int para controlar el array nameList a la hora de añadir nombres */
	private static int cont = 0;

	/** Variable String para indicar la ruta de creacion del PDF */
	private static String route;

	
	/** Variable donde guardamos la fecha de creacion */
	static LocalDate date = LocalDate.now();

	/**
	 * Método haciendo uso de la dependencia org.apache.commons.lang3
	 * 
	 * @param name Variable tipo String donde almacenaremos el nombre del jugador
	 */
	public static void insertName(String name) {

		if (StringUtils.isBlank(name)) {
			
			System.out.println("Has introducido un nombre en blanco");
			
			//Bucle para verificar que no se introducen nombres en blanco
			do {	
				
			System.out.println("Introduce un nombre válido");
			
			name = sc.nextLine();
			
			insertName(name);
			
			}while((StringUtils.isBlank(name)));
			
		} else {

			nameList[cont] = name;
			cont++;
			System.out.println("Nombre añadido");
		}

	}
	/**
	 * Metodo main
	 * @param args Metodo donde se ejecuta el codigo
	 */
	public static void main(String[] args) {

		
		PDDocument document = new PDDocument();

		PDPage page = new PDPage();

		document.addPage(page);

		PDFont font = PDType1Font.HELVETICA_BOLD_OBLIQUE;

		System.out.println("Dame una ruta para guardar el archivo: (Ex: C:\\\\Users\\\\Alejandro-NTT\\\\Desktop)");
		route = sc.nextLine();

		System.out.println("BIENVENIDO TELLEZ, INTRODUCE TU ALINEACIÓN DE LA SEMANA");

		System.out.println("Primer jugador:");

		for (int i = 0; i < nameList.length; i++) {

			name = sc.nextLine();
			insertName(name);

			System.out.println("Llega el fin de la dual");

			
			
			System.out.println("Llega el verano");
			System.out.println("NTT data");
			System.out.println("Cambio GitHub");

		}

		

		try {

			PDPageContentStream content = new PDPageContentStream(document, page);

			content.beginText();
			
			content.setFont(font, 20);
			
			content.newLineAtOffset(90, 750);
			
			content.showText("Fecha creación: ");
			
			content.endText();

			content.beginText();
			
			content.setFont(font, 20);
			
			content.newLineAtOffset(250, 750);
			
			// Uso de la segunda dependencia utilizada org.joda.time
			content.showText(date.toString());
			
			content.endText();
			
			for (int i = 0; i < 8; i++) {

				content.beginText();

				content.setFont(font, 20);

				content.newLineAtOffset(100, 700 + (-i * 20));

				content.showText(i + 1 + ". " + nameList[i]);

				content.endText();

			}

			content.beginText();
			
			content.setFont(font, 20);
			
			content.newLineAtOffset(90, 450);
			
			content.showText("Fecha renovación: ");
			
			content.endText();

			content.beginText();
			
			content.setFont(font, 20);
			
			content.newLineAtOffset(290, 450);
			
			content.showText(date.plusYears(1).toString());
			
			content.endText();

			// Cierre del contentStream
			content.close();

			// Seleccion de la ruta donde se genera el documento
			document.save(route + "\\Hello.pdf");

			// Cierre del documento
			document.close();

		} catch (IOException ie) {

			ie.printStackTrace();

		}

	}

}
