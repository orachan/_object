
public class Murata extends player {
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;
	
	// player_atribute
	
	//private String name_;
	//private int Win_Count_ = 0;
	
	//player_method
	
	public int show_hand() {
		int hand = 0;
		hand = STONE;
		return hand;
		
	}
	
	/*public void notifyResult(boolean result) {
		if (true == result){
			Win_Count_ += 1;	
	}
	}
	
	public int getWinCount() {
		return Win_Count_;
	}
	
	public String getName() {
		return name_;
	}*/
	public Murata(String name) {
		super(name);
		
	}

}
