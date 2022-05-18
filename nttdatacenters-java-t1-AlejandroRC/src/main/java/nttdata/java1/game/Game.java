package nttdata.java1.game;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase Game
 * @author Alejandro-NTT
 *
 */
public class Game {
	
	private int finalScore;
	private Player jugador;
	private List<Player> players = new ArrayList<>();
	private List <Ball> balls = new ArrayList<>();
	
	/**
	 * 
	 * @param player
	 * A través de este constructor se van añadiendo los jugadores a nuestra lista de jugadores.
	 */
	
	//Añadir un jugador al constructor para evitar el null pointer al añadir la puntuacion.
	public Game(Player jugador) {
		super();
		players.add(jugador);
	}
	
	/**
	 * Carga las bolas de cada jugador
	 */
	//añadir aqui el bounceBall porque podria solucionar problemas 
	public void loadBall(int load) {
		
		for(int i = 0; i < load ; i++) {
			
			balls.add(new Ball(i));
			
		}
		
	}	

	public void getScore() {

		Iterator <Ball> iter = balls.iterator();

		while (iter.hasNext()) {

			Ball elem = iter.next();
			elem.bounceBall();
			finalScore += elem.getScore();
			jugador.setScore(finalScore);
			
		}

	}
	
	public void insertNewPlayer(Player p) {
		
		players.add(p);
		
	}
			
	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	
	

	@Override
	public String toString() {
		return "Game [finalScore=" + ", jugador=" + jugador + ", players=" + players + ", balls=" + balls
				+ "]";
	}

	

	
	
}
