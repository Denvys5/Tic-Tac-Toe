package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	public static final Scanner scanner = new Scanner(System.in);
	public static String string1;
	public static void main(String[] args){
		int[][] a = new int[3][3];
		System.out.println("Rules: First player = 1; Second player = 2; Empty space = 0.");
		System.out.println("Please, don`t use another symbols.");
		turn(1, a, 1);
		turn(2, a, 2);
		turn(1, a, 3);
		turn(2, a, 4);
		turn(1, a, 5);
		turn(2, a, 6);
		turn(1, a, 7);
		turn(2, a, 8);
		turn(1, a, 9);
	}

	public static void fieldRenderer(int[][] a){
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
	}
	
	public static void checkForWin(int[][] a, int player){
		if(a[0][0] == player && a[0][1] == player && a[0][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer(a);
			System.exit(0); 
		}else if(a[1][0] == player && a[1][1] == player && a[1][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer(a);
			System.exit(0);
		}else if(a[2][0] == player && a[2][1] == player && a[2][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer(a);
			System.exit(0);
		}else if(a[0][0] == player && a[1][0] == player && a[2][0] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer(a);
			System.exit(0);
		}else if(a[0][1] == player && a[1][1] == player && a[2][1] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer(a);
			System.exit(0);
		}else if(a[0][2] == player && a[1][2] == player && a[2][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer(a);
			System.exit(0);
		}else if(a[0][0] == player && a[1][1] == player && a[2][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer(a);
			System.exit(0);
		}else if(a[2][0] == player && a[1][1] == player && a[0][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer(a);
			System.exit(0);
		}
	}
	
	public static void turn(int player, int[][] a, int turnNumber){
		System.out.println("Player " + player + " turn");
		//Field Render
		fieldRenderer(a);
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		int arg1 = string1.charAt(0) - 48;
		int arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = player;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = player;
			}else{
				System.out.println("You lose your turn. Game is broken.");
				System.exit(0);
			}
		}
		//Win params
		if(turnNumber >= 5){
			checkForWin(a, player);
		}
		//Check for draw
		if(turnNumber == 9){
			if(a[0][0] != 0 && a[0][1] != 0 && a[0][2] != 0 && a[1][0] != 0 && a[2][0] != 0 && a[1][1] != 0 && a[2][2] != 0 && a[1][2] != 0 && a[2][1] != 0){
				System.out.println("Draw!");
				fieldRenderer(a);
				System.exit(0);
			}
		}
	}
}
