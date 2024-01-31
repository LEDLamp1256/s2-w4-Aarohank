
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player implements Comparable<Player>{
	
	private int myScore;
	
	public Player ( ) {
		myScore = 0;
	}

	public int getScore(){
		return myScore;
	}
	
	public void increaseScore (int amt) {
		myScore += amt;
	}
	
	public int score ( ) {
		return myScore;
	}
	
	public boolean cooperates ( ){
	   return true;
	}
	
	public void remember (boolean opponentChoice) {		
	}

	public String toString(){
		return this.getClass().getName() + " " + myScore;
	}

	public int compareTo(Player other){
		//return difference
		return this.score() - other.score();
	}
}