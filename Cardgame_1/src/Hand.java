import java.util.ArrayList;

public class Hand {
	private ArrayList hand_ = new ArrayList();

	//add method
	public void addCard(Card card) {
		hand_.add(card);
	}
	
	//pickCard method
	public Card pickCard() {
		Card pickedCard = (Card) hand_.remove(0);
		return pickedCard;
	}
	
	//shuffle method
	public void shuffle() {
		int number = hand_.size();
		int pos;
		
		//loop
		for(int count = 0; count < number * 2; count++) {
			
			pos = (int) (Math.random() * number);
			Card pickedCard = (Card) hand_.remove(pos);
			
			hand_.add(pickedCard);
			
		}
	}
	
	//getnumberofcard method
	public int getNumberOfCards() {
		return hand_.size();
	}
	
	//findsamenumbercard method
	public Card[] findNumberCard() {
		int numberOfCards = hand_.size();
		Card[] sameCards = null;
		
		
		if (numberOfCards > 0) {
			
			int lastIndex = numberOfCards - 1;
			Card lastAddCard = (Card) hand_.get(lastIndex);
			
			int lastAddCardNum = lastAddCard.getNumber();
			
			for(int index = 0; index < lastIndex; index++) {
				Card card = (Card) hand_.get(index);
				if(card.getNumber() == lastAddCardNum) {
					sameCards = new Card[2];
					sameCards[0] = (Card) hand_.remove(lastIndex);
					sameCards[1] = (Card) hand_.remove(index);
					break;
				}
			}
			
		}
		
		return sameCards;
	}
	
	//toString overWride
	public String toString() {
		StringBuffer string = new StringBuffer();
		
		int size = hand_.size();
		if(size > 0) {
			for (int index = 0; index < size; index++) {
				Card card = (Card) hand_.get(index);
				string.append(card);
				string.append(" ");
			}
		}
		
		return string.toString();
	}

}
