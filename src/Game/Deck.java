package Game;

public class Deck {
	private Card[] deck;
	
	public Deck(Player [] players) {
		
		deck = new Card[52];
		deck = Deck.createCards();
		deck = Deck.shuffleCards(deck);
		Deck.dealCards(players, deck);
	}

	
	public static Card[] createCards() {
		String [] suits = {"Clubs", "Diamonds", "Hearts","Spades"};
		int counter = 0;
		Card[] deck = new Card[52];
		for(int i = 2; i < 15; i++) {
			for(String x:suits){
				Card newCard = new Card(i,x);
				
				deck[counter] = newCard;
				counter ++;
		
			}
		}
		
		return deck;
	}
	public static void dealCards(Player[] players, Card[] cards) {
		//give each player 17 cards, add to their list of cards
		

		for(int j = 0; j<17;j++) {
			
			players[0].addCard(cards[j]);
		}
		for(int i = 17; i<34;i++) {
			
			players[1].addCard(cards[i]);
		}
		for(int i = 34; i<51;i++) {
			
			players[2].addCard(cards[i]);
		}
		
	}
	public static Card[] shuffleCards(Card[] deck) {
		//shuffle cards twice
		for (int i = 0; i < deck.length; i++) {
		       int index = (int )(Math.random() * 51  );

		       Card temp = deck[i];
		       deck[i] = deck[index];
		       deck[index] = temp;
		       
		     }
		for (int i = 0; i < deck.length; i++) {
		       int index = (int )(Math.random() * 51  );

		       Card temp = deck[i];
		       deck[i] = deck[index];
		       deck[index] = temp;
		     }
		
		return deck;
	}
	
}
