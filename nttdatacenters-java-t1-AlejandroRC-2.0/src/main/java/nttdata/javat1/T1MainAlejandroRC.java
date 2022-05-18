package nttdata.javat1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import nttdata.java1.game.Game;
import nttdata.java1.game.Player;

/**
 * Clase principal donde se ejecutan los metodos de la clase Game
 * 
 * @author Rubiks
 *
 */
public class T1MainAlejandroRC {

	public static void main(String[] args) {
		/**
		 * Variable que se solicita al usuario para seleccionar la opcion del menu
		 */
		int opcion = 0;
		int bolas;
		Scanner sc = new Scanner(System.in);
		/**
		 * Coleccion que almacena datos asociando una llave a un valor.
		 */
		Map<String, Integer> tableScore = new HashMap<>();
		System.out.println("Introduce un NICK");
		Player p = new Player(sc.nextLine());
		Game pinball = new Game(p);

		do {

			System.out.println("INTRODUCE UNA OPCION");
			System.out.println("1- Jugar");
			System.out.println("2- Tabla puntuaciones");
			System.out.println("3- Tirada nuevo jugador");
			System.out.println("4- Salir");
//			opcion = sc.nextInt();

			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
			}

			switch (opcion) {

			case 1:

				System.out.println("¿Cuantas bolas quieres comprar?");
				try {
					bolas = sc.nextInt();
					pinball.startGame(p, bolas);
					tableScore.put(p.getNick(), p.getScore());
				} catch (InputMismatchException e) {
					System.out.println("ERROR! Has introducido un dato incorrecto");
					sc.next();
				}

				break;

			case 2:

				System.out.println("--------------------------------");
				System.out.printf("%10s %20s", "JUGADOR", "PUNTUACION");
				System.out.println();
				System.out.println("--------------------------------");

				for (String key : tableScore.keySet()) {
					System.out.printf("%10s %20s", key, tableScore.get(key));
					System.out.println();
				}

				System.out.println("--------------------------------");

				break;

			case 3:
				
				
				// Con newGame() reseteamos la instancia p dejando sus valores a nulo
				pinball.newGame();
				System.out.println("Nick del nuevo jugador:");
				sc.nextLine();
				p = new Player(sc.nextLine());
				System.out.println("¿Cuantas bolas quieres comprar?");

				try {
					bolas = sc.nextInt();
					pinball.startGame(p, bolas);
					tableScore.put(p.getNick(), p.getScore());
				} catch (InputMismatchException e) {
					System.out.println("ERROR! Has introducido un dato incorrecto");
					sc.next();
				}

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

}
