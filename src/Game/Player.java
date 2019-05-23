package Game;

import java.util.*;

public class Player {
	
	private String name;
	private List<Card> cards;
	private int numOfRoundsWon = 0;
	List<Integer> indexesOfPlayedCards = new ArrayList<Integer>();
	List<Integer> valueOfCardsPlayed = new ArrayList<Integer>();
	
	public Player() {
		cards = new ArrayList<Card>();
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Card> getCards() {
		return cards;
	}
	public int getNumOfRoundsWon() {
		return numOfRoundsWon;
	}
	public void winRound() {
		this.numOfRoundsWon++;
	}
	public void addCard(Card card) {
		this.cards.add(card);
	}

}
