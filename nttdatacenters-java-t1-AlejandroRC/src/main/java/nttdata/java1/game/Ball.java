package nttdata.java1.game;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Clase Ball
 * @author Alejandro-NTT
 *
 */
public class Ball {

	private int score;
	private int random;
	private int id;

//	public Ball(int id) {
//		super();
//		this.id = id;
//	}
	
	public Ball() {
		
	}

	public double getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	private static final Logger CHIVATO = LoggerFactory.getLogger("padre");

	/**
	 * Genera un numero aleatorio y asigna una puntuacion a la bola
	 */
//	public void bounceBall() {
//
//		CHIVATO.info("Inicio del rebote");
//
//		random = (int) (Math.random() * 10 + 1);
//
//		CHIVATO.debug("Numero aleatorio generado: {}", random);
//
//		if (random >= 1 && random <= 3) {
//
//			score = 100;
//
//		} else if (random > 3 && random <= 6) {
//
//			score = 200;
//
//		} else if (random > 6 && random <= 9) {
//
//			score = 300;
//
//		} else {
//
//			score = 0;
//
//		}
//
//		CHIVATO.info("Fin del rebote");
//
//	}
	
	public int bounceBall() {
		int score =0;

		CHIVATO.info("Inicio del rebote");

		random = (int) (Math.random() * 10 + 1);

		CHIVATO.debug("Numero aleatorio generado: {}", random);

		if (random >= 1 && random <= 3) {

			score = 100;

		} else if (random > 3 && random <= 6) {

			score = 200;

		} else if (random > 6 && random <= 9) {

			score = 300;

		} else {

			score = 0;

		}

		CHIVATO.info("Fin del rebote");
		return score;
	}
	
	@Override
	public String toString() {
		return "Ball [score=" + score + ", id=" + id + "]";
	}

}
