
public class RandomTactics  implements Tactics{
	
	public int readTactics(){
	
	int hand = 0;
	double randomNum = Math.random() * 3;
	
	if(randomNum < 1) {
		hand = player.STONE;
	}
	
	else if(randomNum < 2) {
		hand = player.SCISSORS;
	}
	
	else if(randomNum < 3) {
		hand = player.PAPER;
	}
	
	return hand;

}
	
	}
