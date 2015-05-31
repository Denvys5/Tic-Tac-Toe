package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import static tictactoe.TicTacToe.Field;
import static tictactoe.TicTacToe.player;
import static tictactoe.TicTacToe.turn;
import static tictactoe.TicTacToe.winner;

public class Actions implements ActionListener{
	private final JButton button;
	private int buttonNumber;
	public Actions(JButton button){
		this.button = button;
	}

	public void actionPerformed(ActionEvent arg0){
		buttonNumber = arg0.getActionCommand().charAt(0) - 48;
		switch (buttonNumber) {
			case 1: if(Field[0][0] == 0)Field[0][0] = player; break;
			case 2: if(Field[1][0] == 0)Field[1][0] = player; break;
			case 3: if(Field[2][0] == 0)Field[2][0] = player; break;
			case 4: if(Field[0][1] == 0)Field[0][1] = player; break;
			case 5: if(Field[1][1] == 0)Field[1][1] = player; break;
			case 6: if(Field[2][1] == 0)Field[2][1] = player; break;
			case 7: if(Field[0][2] == 0)Field[0][2] = player; break;
			case 8: if(Field[1][2] == 0)Field[1][2] = player; break;
			case 9: if(Field[2][2] == 0)Field[2][2] = player; break;
			default: break;
		}
		turn();
		button.removeActionListener(this);
	}
	
	public void turn(){
		button.setIcon(Screen.getIconFromPlayer());
		if(turn >= 5){
			checkForWin();
		}
		checkForDraw();
		turn++;
		if(player == 1) player++;
		else if(player == 2) player--;
	}
	
	public static void checkForDraw(){
		if(TicTacToe.turn == 9){
			if(Field[0][0] != 0 && Field[0][1] != 0 && Field[0][2] != 0 && Field[1][0] != 0 && Field[2][0] != 0 && Field[1][1] != 0 && Field[2][2] != 0 && Field[1][2] != 0 && Field[2][1] != 0){
				Screen.Draw();
			}
		}
	}
	
	public static void checkForWin(){
		if(Field[0][0] == player && Field[0][1] == player && Field[0][2] == player){
			winner = player;
			Screen.Win();
		}else if(Field[1][0] == player && Field[1][1] == player && Field[1][2] == player){
			winner = player;
			Screen.Win();
		}else if(Field[2][0] == player && Field[2][1] == player && Field[2][2] == player){
			winner = player;
			Screen.Win();
		}else if(Field[0][0] == player && Field[1][0] == player && Field[2][0] == player){
			winner = player;
			Screen.Win();
		}else if(Field[0][1] == player && Field[1][1] == player && Field[2][1] == player){
			winner = player;
			Screen.Win();
		}else if(Field[0][2] == player && Field[1][2] == player && Field[2][2] == player){
			winner = player;
			Screen.Win();
		}else if(Field[0][0] == player && Field[1][1] == player && Field[2][2] == player){
			winner = player;
			Screen.Win();
		}else if(Field[2][0] == player && Field[1][1] == player && Field[0][2] == player){
			winner = player;
			Screen.Win();
		}
	}
}
