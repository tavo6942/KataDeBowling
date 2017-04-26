package cl.ubb;

public class Game {
	
	int score;
	public Game(){
		score=0;
	}
	public int Score(){
		return score;
	}
	public void Roll(int pins){
		score+=pins;
	}

}
