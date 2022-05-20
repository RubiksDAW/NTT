package nttdata.java1.game;

/**
 * 
 * @author Rubiks
 *
 */
public class Game {
	/**
	 * Objeto jugador que se instancia a partir de su nick
	 */
	private Ball p;
	
	public Game(Ball p) {
		super();
		this.p = p;
	}

	/**
	 * Pone a nulo los valores del jugador para dar paso a nuevos datos de un nuevo
	 * usuario
	 */
	public void newGame() {

		p.setNick(null);
		p.setScore(0);

	}

	/**
	 * Simula el lanzamiento de las bolas a un jugador asociado para determinar la
	 * puntuacion
	 * 
	 * @param p
	 * @param numBalls
	 */
	public void startGame(Ball p, int numBalls) {

		p.bounceBall(numBalls);
		

	}

}
