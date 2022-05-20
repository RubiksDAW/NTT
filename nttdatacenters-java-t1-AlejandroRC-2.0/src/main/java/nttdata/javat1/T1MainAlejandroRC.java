package nttdata.javat1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nttdata.java1.game.Game;
import nttdata.java1.game.Ball;

/**
 * Clase principal donde se ejecutan los metodos de la clase Game
 * 
 * @author Rubiks
 *
 */
public class T1MainAlejandroRC {

	private static final Logger CHIVATO = LoggerFactory.getLogger("padre");

	public static void main(String[] args) {

		/** Variable que se solicita al usuario para seleccionar la opcion del menu */
		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		/** Coleccion que almacena datos asociando una llave a un valor */
		Map<String, Integer> tableScore = new HashMap<>();

		System.out.println("Introduce tu NICK");

		Ball p = new Ball(sc.nextLine());

		Game pinball = new Game(p);

		StringBuilder str = new StringBuilder();

		do {

			System.out.println("INTRODUCE UNA OPCION");
			System.out.println("1- Jugar");
			System.out.println("2- Tabla puntuaciones");
			System.out.println("3- Tirada nuevo jugador");
			System.out.println("4- Salir");

			opcion = validateDataMenu(opcion, sc);

			switch (opcion) {

			case 1:

				System.out.println("¿Cuantas bolas quieres comprar?");
				validateData(sc, tableScore, p, pinball);

				CHIVATO.debug("Nombre del jugador asociado a la bola {}", p.getNick());
				CHIVATO.debug("Numero de rebotes obtenidos {}", p.getRandom());
				CHIVATO.debug("Puntuación obtenida por la el jugador {}", p.getScore());

				str.append(System.getProperty("line.separator"));
				str.append("Tu puntuación ha sido de: " + p.getScore());
				str.append(", sigue jugando para batirla");
				str.append(System.getProperty("line.separator"));

				System.out.println(str);

				break;

			case 2:

				// Utilizamos printf para dar formato a la salida por consola
				System.out.println("--------------------------------");
				System.out.printf("%10s %20s", "JUGADOR", "PUNTUACION");
				System.out.println();
				System.out.println("--------------------------------");

				for (String key : tableScore.keySet()) {

					System.out.printf("%10s %20s", key, tableScore.get(key));
					System.out.println();

					CHIVATO.debug("Clave del mapa generada {}", key);
					CHIVATO.debug("Valor asociado al mapa {}", tableScore.get(key));

				}

				System.out.println("--------------------------------");

				break;

			case 3:

				// Con newGame() reseteamos la instancia p dejando sus valores a nulo
				pinball.newGame();

				System.out.println("Nick del nuevo jugador:");
				sc.nextLine();

				p = new Ball(sc.nextLine());
				System.out.println("¿Cuantas bolas quieres comprar?");

				validateData(sc, tableScore, p, pinball);

				break;

			case 4:

				System.out.println("Vuelve pronto!");

				break;

			default:
				System.out.println("Selecciona una opción válida");

				break;
			}

		} while (opcion != 4);
	}

	/**
	 * Comprueba que no se introducen valores erroneos por escaner
	 * 
	 * @param opcion
	 * @param sc
	 * @return
	 */
	private static int validateDataMenu(int opcion, Scanner sc) {

		try {

			opcion = sc.nextInt();

		} catch (InputMismatchException e) {

			sc.next();
		}

		return opcion;
	}

	/**
	 * Comprueba que no se añaden valores erroneos
	 * 
	 * @param sc
	 * @param tableScore
	 * @param p
	 * @param pinball
	 */

	private static void validateData(Scanner sc, Map<String, Integer> tableScore, Ball p, Game pinball) {
		int bolas;
		try {

			// Validacion de los datos introducidos
			bolas = sc.nextInt();
			pinball.startGame(p, bolas);
			tableScore.put(p.getNick(), p.getScore());

		} catch (InputMismatchException e) {

			System.out.println("ERROR! Has introducido un dato incorrecto");
			sc.next();

		}
	}

}
