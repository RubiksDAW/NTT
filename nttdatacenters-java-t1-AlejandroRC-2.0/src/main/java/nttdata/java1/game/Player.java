package nttdata.java1.game;

/**
 * 
 * @author Rubiks
 *
 */
public class Player {
	/**
	 * Nombre del jugador
	 */
	private String nick;
	/**
	 * Puntuacion del jugador
	 */
	private int score;
	/**
	 * Numero aleatorio entre 1-10 que simula el numero de rebotes de la bola
	 */
	private int random;

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}
	/**
	 * Constructor clase player
	 * @param nick
	 */
	public Player(String nick) {
		super();
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * Parametro solicitado al usuario para establecer el numero de bolas que el
	 * jugador va a lanzar
	 * 
	 * @param numBalls
	 */
	public void bounceBall(int numBalls) {

		for (int i = 0; i < numBalls; i++) {

			random = (int) (Math.random() * 10 + 1);
			System.out.println(random);

			if (random >= 1 && random <= 3) {

				score += 100;

			} else if (random > 3 && random <= 6) {

				score += 200;

			} else if (random > 6 && random <= 9) {

				score += 300;

			} else {

				score += 0;

			}

		}

	}

}
