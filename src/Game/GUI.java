package Game;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GUI extends JFrame {

	private JPanel contentPane;
	private Handler guiHandler;
	public JButton [] buttons = new JButton[17];
	private JButton [] hand = new JButton[3];
	int totalRoundsPlayed = 0;
	Player[] players = new Player[3];
	int turn = 0;
	JLabel lblTurnPlayer;
	JButton goBtn;
	int cardsLaid = 0;
	Card leadCard;
	JLabel player1Score;
	JLabel player2Score;
	JLabel player3Score;
	JLabel roundsPlayed;
	

	
	public static void main(String[] args) throws IOException {
		Handler handler = new Handler();
		GUI myGui = new GUI();
		

		
		
	}

	
	public GUI() throws IOException {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		guiHandler = new Handler();
		
		
		// the next 17 buttons represent the cards and are placed at the bottom of the screen
		// setting the action command associates each button with the index they are placed in the array
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(guiHandler);
		btnNewButton.setBounds(276, 635, 117, 129);
		btnNewButton.setActionCommand("0");
		
		contentPane.add(btnNewButton);
		
		buttons[0] = btnNewButton;
		
		JButton button_1 = new JButton();
		button_1.setBounds(533, 635, 117, 129);
		button_1.addActionListener(guiHandler);
		button_1.setActionCommand("1");

		contentPane.add(button_1);
		buttons[1] = button_1;

		
		JButton button_2 = new JButton();
		button_2.setBounds(660, 635, 117, 129);
		button_2.addActionListener(guiHandler);
		button_2.setActionCommand("2");


		contentPane.add(button_2);
		buttons[2] = button_2;

		
		JButton button_3 = new JButton();
		button_3.setBounds(789, 635, 117, 129);
		button_3.addActionListener(guiHandler);
		button_3.setActionCommand("3");


		contentPane.add(button_3);
		buttons[3] = button_3;

		
		JButton button_4 = new JButton();
		button_4.setBounds(918, 635, 117, 129);
		button_4.addActionListener(guiHandler);
		button_4.setActionCommand("4");


		contentPane.add(button_4);
		buttons[4] = button_4;

		
		JButton button_5 = new JButton();
		button_5.setBounds(1047, 635, 117, 129);
		button_5.addActionListener(guiHandler);
		button_5.setActionCommand("5");


		contentPane.add(button_5);
		buttons[5] = button_5;

		
		JButton button_6 = new JButton();
		button_6.setBounds(1176, 635, 117, 129);
		button_6.addActionListener(guiHandler);
		button_6.setActionCommand("6");
		contentPane.add(button_6);
		buttons[6] = button_6;

		
		JButton button_7 = new JButton();
		button_7.setBounds(1305, 635, 117, 129);
		button_7.addActionListener(guiHandler);
		button_7.setActionCommand("7");
		contentPane.add(button_7);
		buttons[7] = button_7;

		
		JButton button_8 = new JButton();
		button_8.setBounds(151, 635, 117, 129);
		button_8.addActionListener(guiHandler);
		button_8.setActionCommand("8");
		contentPane.add(button_8);
		buttons[8] = button_8;

		
		JButton button_9 = new JButton();
		button_9.setBounds(22, 635, 117, 129);
		button_9.addActionListener(guiHandler);
		button_9.setActionCommand("9");
		contentPane.add(button_9);
		
		JButton button_10 = new JButton();
		button_10.setBounds(404, 504, 117, 129);
		button_10.addActionListener(guiHandler);
		button_10.setActionCommand("10");
		contentPane.add(button_10);
		
		JButton button_11 = new JButton();
		button_11.setBounds(533, 504, 117, 129);
		button_11.addActionListener(guiHandler);
		button_11.setActionCommand("11");
		contentPane.add(button_11);
		
		JButton button_12 = new JButton();
		button_12.setBounds(660, 504, 117, 129);
		button_12.addActionListener(guiHandler);
		button_12.setActionCommand("12");
		contentPane.add(button_12);
		
		JButton button_13 = new JButton();
		button_13.setBounds(789, 504, 117, 129);
		button_13.addActionListener(guiHandler);
		button_13.setActionCommand("13");
		contentPane.add(button_13);
		
		JButton button_14 = new JButton();
		button_14.setBounds(918, 504, 117, 129);
		button_14.addActionListener(guiHandler);
		button_14.setActionCommand("14");
		contentPane.add(button_14);
		
		JButton button_15 = new JButton();
		button_15.setBounds(1047, 504, 117, 129);
		button_15.addActionListener(guiHandler);
		button_15.setActionCommand("15");
		contentPane.add(button_15);
		
		JButton button = new JButton();
		button.setBounds(404, 635, 117, 129);
		button.addActionListener(guiHandler);
		button.setActionCommand("16");
		contentPane.add(button);
		
		buttons[9] = button_9;
		buttons[10] = button_10;
		buttons[11] = button_11;
		buttons[12] = button_12;
		buttons[13] = button_13;
		buttons[14] = button_14;
		buttons[15] = button_15;
		buttons[16] = button;
		
		
		//the next 3 buttons are the ones in the middle of the screen that represent the hand
		
		JButton button_16 = new JButton();
		button_16.setBounds(533, 210, 117, 129);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton();
		button_17.setBounds(662, 210, 117, 129);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton();
		button_18.setBounds(791, 210, 117, 129);
		contentPane.add(button_18);
		
		
		hand[0] = button_16;
		hand[1] = button_17;
		hand[2] = button_18;
		
		JLabel lblHand = new JLabel("Hand");
		lblHand.setForeground(Color.WHITE);
		lblHand.setBounds(686, 170, 61, 16);
		contentPane.add(lblHand);
		
		//label displays whose turn it is
		 lblTurnPlayer = new JLabel("Turn: Player 1");
		lblTurnPlayer.setForeground(Color.WHITE);
		lblTurnPlayer.setBounds(628, 20, 164, 16);
		contentPane.add(lblTurnPlayer);
		
		//this button is pressed to go to the next round
		//in the handler check if the action command is Go, if not then the button pressed was a card
		 goBtn = new JButton("Go");
		goBtn.setEnabled(false);
		goBtn.setBounds(1305, 33, 117, 29);
		goBtn.addActionListener(guiHandler);
		goBtn.setActionCommand("Go");
		contentPane.add(goBtn);
		
		 player1Score = new JLabel("Player1's Score: 0");
		 player1Score.setForeground(Color.WHITE);
		player1Score.setBounds(32, 58, 126, 16);
		contentPane.add(player1Score);
		
		 player2Score = new JLabel("Player2's Score: 0");
		 player2Score.setForeground(Color.WHITE);
		player2Score.setBounds(32, 96, 126, 16);
		contentPane.add(player2Score);
		
		 player3Score = new JLabel("Player3's Score: 0");
		 player3Score.setForeground(Color.WHITE);
		player3Score.setBounds(32, 137, 126, 16);
		contentPane.add(player3Score);
		
		 roundsPlayed = new JLabel("Rounds Played: 0");
		roundsPlayed.setForeground(Color.WHITE);
		roundsPlayed.setBounds(32, 20, 126, 16);
		contentPane.add(roundsPlayed);

		
		
		createPlayers();
		Card [] deck = {};
		deck = Deck.createCards();
		Deck.shuffleCards(deck);
		Deck.dealCards(players, deck);
		
		

		displayCards(players[0]);
		this.lblTurnPlayer.setText("Turn: "+ players[0].getName());
		this.guiHandler.setGUI(this);
		this.setVisible(true);
		
		
	}


	public void setHandler(Handler handler) {
		guiHandler = handler;
		
	}
	public void createPlayers() {
		//create the players
		for(int i = 0; i<=2;i++) {
			Player player1 = new Player();
			players[i] = player1;
			
			int index = i+1;
			String playerName = JOptionPane.showInputDialog("Enter Player " + index +"'s name");
			
			players[i].setName(playerName);
			
		}
		this.player1Score.setText(players[0].getName() + "'s Score: 0");
		this.player2Score.setText(players[1].getName() + "' Score: 0");
		this.player3Score.setText(players[2].getName() + "'s Score : 0");

	}
	public void displayCards(Player myPlayer) throws IOException {
		//for each player, get the card for each index in their list of cards, find the image that is named after 
		//their card, and set the buttons that display the cards to that card at the same index for the array of buttons
		for(int i = 0; i<myPlayer.getCards().size();i++) {
			Card myCard = myPlayer.getCards().get(i);
			
			buttons[i].setVisible(true);
			
			Image img = ImageIO.read(getClass().getResource(myCard.getNumber() + "of"+ myCard.getSuit()+".png"));
			buttons[i].setIcon(new ImageIcon(img.getScaledInstance( 112, 125,  java.awt.Image.SCALE_SMOOTH )));
			
			//check if player has played that card before, if so it cant be clicked
			if(myPlayer.indexesOfPlayedCards.contains(i)) {
				buttons[i].setVisible(false);
			}
			
		}
		
		
	}
	public void layCard(int playerTurn, String buttonPressed) throws IOException {
		// in the handler after each person lays a card it updates the turn to the next player
		
		//get the player object from array of players, the index of the player come from whoevers turn it is  guiHandler.getTurn
		Player player = this.players[guiHandler.getTurn()];
		
		//get cards for the player above
		List<Card> cards = player.getCards();
		
		//this is the card the player chose. getButtonPressed is a function for getting the index of the button that was pressed
		//that index is the same index where the card is located for the list of the current players Card
		Card cardToPlay = cards.get(Integer.parseInt(guiHandler.getButtonPressed()));
		
		
		//no cards are played yet, this card will be the lead card and everyone must match this suit in order to win.
			if(this.cardsLaid == 0) {
				this.leadCard = cardToPlay;
			}
		
		//mark the label for the players turn	
		 int turn = guiHandler.getTurn();
		this.lblTurnPlayer.setText("Turn: " + player.getName());
		
		// add the card the player chose to the list of cards they have already picked
		player.indexesOfPlayedCards.add(Integer.parseInt(guiHandler.getButtonPressed()));
		player.valueOfCardsPlayed.add(cardToPlay.getNumber());
		
		//images are mark number of suit, this associates the image with the card picked and displays it in the hand of cards
		//the array hand is an array of the cards that have been played by all players in order player1 card is index 0 player 2 is index 1 etc
			Image img = ImageIO.read(getClass().getResource(cardToPlay.getNumber() + "of"+ cardToPlay.getSuit()+".png"));
			hand[turn].setIcon(new ImageIcon(img.getScaledInstance( 112, 125,  java.awt.Image.SCALE_SMOOTH )));
			
			//hand[turn] is the card the player put in the hand, this sets the action command as the index of the card in the current players list of cards
			hand[turn].setActionCommand(guiHandler.getButtonPressed());
			
			//display the cards for the next player,
			this.cardsLaid ++;
			
			if(guiHandler.turn == 2) {
				guiHandler.turn = 0;
				}else {
				guiHandler.turn++;
				}
				this.setTurnLabel(guiHandler.getTurn());
			
			//if there are 3 cards laid go to checkWinner method
			if(this.cardsLaid == 3) {
				checkWinner();
			}
			
		
		
	}
	public void setTurnLabel(int turnIndex) {
		this.lblTurnPlayer.setText("Turn: " + this.players[turnIndex].getName());
	}
	
	public void checkWinner() {

		System.out.println("Check for winner");
		goBtn.setEnabled(true);
		
		//after the loop this will be the index of the winner player 1 is index 0 player 2 is index 1 player 3 is index 2
		int winnerIndex = 0;
		for(int i = 0; i<3;i++) {
			//get each cards laid in order from the hand
			//find out what kind of card it is by getting the action command which is an index of the location of the card in the players list of cards
			
			int cardIndex = Integer.parseInt(this.hand[i].getActionCommand());
			Card card = this.players[i].getCards().get(cardIndex);
			
			
			
			//if the card is of the same suit as the lead card that was first laid, it is eligible to be a winner
			if(card.getSuit().equals(this.leadCard.getSuit())) {
				//find the card of the current winner by getting the player object from the winnerIndex
				//then use the action command to get the index of the card they laid in thatplayers list of cards
				Card currentWinner = this.players[winnerIndex].getCards().get(Integer.parseInt(this.hand[winnerIndex].getActionCommand()));
				
				//if the card played's number is larger than the current winner, that card is the current winner
				if(card.getNumber() > currentWinner.getNumber() ) {
					winnerIndex = i;
					
				}
			}else {
				//not  a winner
			}
			
			
		}
		
		
		this.players[winnerIndex].winRound();
		
		guiHandler.turn = winnerIndex;
		this.setTurnLabel(winnerIndex);
		showScore();
		JOptionPane.showMessageDialog(this, "Winner is " + this.players[winnerIndex].getName());
		

		
		for(int i = 0; i<this.buttons.length;i++) {
			buttons[i].setVisible(false);
		}
		
	}
	public void clearHand() {
		//reset cards laid to 0 and remove card images to start next round
		//this method is called in the handler if the user hits the go button.
		this.hand[0].setIcon(null);
		this.hand[1].setIcon(null);
		this.hand[2].setIcon(null);
		this.cardsLaid = 0;
	}
	
	public void showScore() {
		//show score
				this.player1Score.setText(this.players[0].getName() + "'s Score: " + this.players[0].getNumOfRoundsWon());
				this.player2Score.setText(this.players[1].getName() + "'s Score: " + this.players[1].getNumOfRoundsWon());
				this.player3Score.setText(this.players[2].getName() + "'s Score: " + this.players[2].getNumOfRoundsWon());
	}
}
