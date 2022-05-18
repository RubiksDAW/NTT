package nttdata.java1.game;
import nttdata.java1.game.Ball;
/**
 * Clase Player
 * @author Alejandro-NTT
 *
 */
public class Player {

	private String nick;
	private int finalScore;
	private int score;
	
	public Player(String nick) {
		
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

	@Override
	public String toString() {
		return "Player [nick=" + nick + ", score=" + score + "]";
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore() {
		Ball ball = new Ball();
		this.score=ball.bounceBall();
	}
	
	
}
