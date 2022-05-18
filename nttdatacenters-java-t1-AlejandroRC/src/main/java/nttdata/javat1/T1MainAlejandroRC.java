package nttdata.javat1;

import nttdata.java1.game.*;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase principal Pinball
 *
 */
public class T1MainAlejandroRC {

	private static final Logger CHIVATO = LoggerFactory.getLogger("padre");

	private static final Logger CHIVATO1 = LoggerFactory.getLogger("hijo");

	public static void main(String[] args)

	{
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta tu nick");
		Player p = new Player(sc.nextLine());
		Game prueba = new Game(p);
//		prueba.insertNewPlayer(p);
		//probar liista como constructor del game
		
		do {
			
			System.out.println("INTRODUCE UNA OPCION");
			System.out.println("1- Jugar");
			System.out.println("2- Tabla puntuaciones");
			System.out.println("3- Tirada nuevo jugador");
			System.out.println("3- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:				
				
				System.out.println("¿Cuantas bolas quieres comprar?");
				prueba.loadBall(sc.nextInt());
				sc.nextLine();
				prueba.getScore();
				CHIVATO1.info("La puntuación final de esta partida ha sido {}", prueba.getFinalScore());
				
				break;
				
			case 2:
				System.out.println(prueba.toString());
				
				break;
				
			case 3:
				
				sc.nextLine();
				System.out.println("Dime el nuevo nick:");
				Player c = new Player(sc.nextLine());	
				
				System.out.println("¿Cuantas bolas quieres comprar?");
				prueba.loadBall(sc.nextInt());
				prueba.getScore();
				c.setScore(prueba.getFinalScore());				
				
				CHIVATO1.info("La puntuación final de esta partida ha sido {}", prueba.getFinalScore());
				
				prueba.insertNewPlayer(c);
				
				break;
			
			default:
				System.out.println("Selecciona una opción válida");

			}
			
		} while (!(opcion == 4));

		

		
/*
		prueba.getScore();

		System.out.println(prueba.toString());

		CHIVATO1.info("La puntuación final de esta partida ha sido {}", prueba.getFinalScore());
*/
	}
}
