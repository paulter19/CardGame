package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Handler implements ActionListener {
	
	int turn = 0;
	String buttonIndex = "";
	GUI myGui;
	int roundsPlayed = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		System.out.println("Action command for button press : " + buttonPressed.getActionCommand());
		if(buttonPressed.getActionCommand().equals("Go")) {
			myGui.clearHand();
			myGui.goBtn.setEnabled(false);
			roundsPlayed ++;
			myGui.roundsPlayed.setText("Rounds Played: " + roundsPlayed);
			if(roundsPlayed == 17) {
				Player winner = checkGameWinner();
				JOptionPane.showMessageDialog(null, "Game Winner is " + winner.getName());
				

			}
			
			

			
		}else {
			
			if(myGui.goBtn.isEnabled()) {
				JOptionPane.showMessageDialog(null, "Click Go to Continue");

				return;
			}
			
			
			this.buttonIndex =  buttonPressed.getActionCommand();
			try {
				myGui.layCard(getTurn(), this.buttonIndex);
			} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}

			
			try {
				System.out.println("Display card");

				myGui.displayCards(myGui.players[turn]);
				System.out.println("Done displaying card");

			} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
			
		}
		
		
	}
	
	public int getTurn() {
		return this.turn;
	}
	public String getButtonPressed() {
		return this.buttonIndex;
	}
	public void setGUI(GUI gui) {
		this.myGui = gui;
	}
	public Player checkGameWinner() {
		Player player1 = myGui.players[0];
		Player player2 = myGui.players[1];
		Player player3 = myGui.players[2];
		Player gameWinner = player1;
		
		//player 1 has the highest number of rounds won
		if(player1.getNumOfRoundsWon() > player2.getNumOfRoundsWon() && player1.getNumOfRoundsWon() > player3.getNumOfRoundsWon()) {
			gameWinner = player1;
		}
		//player 2 has the highest number of rounds won

		if(player2.getNumOfRoundsWon() > player1.getNumOfRoundsWon() && player2.getNumOfRoundsWon() > player3.getNumOfRoundsWon()) {
			gameWinner = player2;
		}
		//player 3 has the highest number of rounds won

		if(player3.getNumOfRoundsWon() > player1.getNumOfRoundsWon() && player3.getNumOfRoundsWon() > player2.getNumOfRoundsWon()) {
			gameWinner = player3;
		}
		//player 1 and 2 are tied at high
		if(player1.getNumOfRoundsWon() == player2.getNumOfRoundsWon() && player1.getNumOfRoundsWon() > player3.getNumOfRoundsWon() ) {
			int player1TotalScore = 0;
			int player2TotalScore = 0;
			for(int i = 0; i<player1.getCards().size();i++) {
				player1TotalScore += player1.valueOfCardsPlayed.get(i);
				player2TotalScore += player2.valueOfCardsPlayed.get(i);

			}
			if(player1TotalScore > player2TotalScore) {
				gameWinner = player1;
			}else {
				gameWinner = player2;
			}

		}
		//player 1 and 3 are tied at high

		if(player1.getNumOfRoundsWon() == player3.getNumOfRoundsWon() && player1.getNumOfRoundsWon() > player2.getNumOfRoundsWon() ) {
			int player1TotalScore = 0;
			int player3TotalScore = 0;
			for(int i = 0; i<player1.getCards().size();i++) {
				player1TotalScore += player1.valueOfCardsPlayed.get(i);
				player3TotalScore += player3.valueOfCardsPlayed.get(i);

			}
			if(player1TotalScore > player3TotalScore) {
				gameWinner = player1;
			}else {
				gameWinner = player3;
			}
		}
		//player 2 and 3 are tied at high

		if(player2.getNumOfRoundsWon() == player3.getNumOfRoundsWon() && player2.getNumOfRoundsWon() > player1.getNumOfRoundsWon() ) {
			int player2TotalScore = 0;
			int player3TotalScore = 0;
			for(int i = 0; i<player2.getCards().size();i++) {
				player2TotalScore += player2.valueOfCardsPlayed.get(i);
				player3TotalScore += player3.valueOfCardsPlayed.get(i);

			}
			if(player2TotalScore > player3TotalScore) {
				gameWinner = player2;
			}else {
				gameWinner = player3;
			}
		}
		
		return gameWinner;


		
		
	}

}
