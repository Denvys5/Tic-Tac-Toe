package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[3][3];
		System.out.println("Rules: First player = 1; Second player = 2; Empty space = 0. Please, don`t use another symbols");
		//Turn 1
		System.out.println("Player 1 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		String string1 = scanner.nextLine();
		int arg1 = string1.charAt(0) - 48;
		int arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 1;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 1;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 1
		if(a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[1][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}
		//Turn 2
		System.out.println("Player 2 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		arg1 = string1.charAt(0) - 48;
		arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 2;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 2;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 2
		if(a[0][0] == 2 && a[0][1] == 2 && a[0][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 2 && a[1][1] == 2 && a[1][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 2 && a[2][1] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 2 && a[1][0] == 2 && a[2][0] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 2 && a[1][1] == 2 && a[2][1] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 2 && a[1][2] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 2 && a[1][1] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 2 && a[1][1] == 2 && a[0][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}
		//Turn 3
		System.out.println("Player 1 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		arg1 = string1.charAt(0) - 48;
		arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 1;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 1;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 1
		if(a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[1][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}
		//Turn 4
		System.out.println("Player 2 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		arg1 = string1.charAt(0) - 48;
		arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 2;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 2;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 2
		if(a[0][0] == 2 && a[0][1] == 2 && a[0][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 2 && a[1][1] == 2 && a[1][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 2 && a[2][1] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 2 && a[1][0] == 2 && a[2][0] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 2 && a[1][1] == 2 && a[2][1] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 2 && a[1][2] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 2 && a[1][1] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 2 && a[1][1] == 2 && a[0][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}
		//Turn 5
		System.out.println("Player 1 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		arg1 = string1.charAt(0) - 48;
		arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 1;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 1;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 1
		if(a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[1][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}
		//Turn 6
		System.out.println("Player 2 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		arg1 = string1.charAt(0) - 48;
		arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 2;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 2;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 2
		if(a[0][0] == 2 && a[0][1] == 2 && a[0][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 2 && a[1][1] == 2 && a[1][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 2 && a[2][1] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 2 && a[1][0] == 2 && a[2][0] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 2 && a[1][1] == 2 && a[2][1] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 2 && a[1][2] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 2 && a[1][1] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 2 && a[1][1] == 2 && a[0][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}
		//Turn 7
		System.out.println("Player 1 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		arg1 = string1.charAt(0) - 48;
		arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 1;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 1;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 1
		if(a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[1][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}
		//Turn 6
		System.out.println("Player 2 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		arg1 = string1.charAt(0) - 48;
		arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 2;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 2;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 2
		if(a[0][0] == 2 && a[0][1] == 2 && a[0][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 2 && a[1][1] == 2 && a[1][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 2 && a[2][1] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 2 && a[1][0] == 2 && a[2][0] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 2 && a[1][1] == 2 && a[2][1] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 2 && a[1][2] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 2 && a[1][1] == 2 && a[2][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 2 && a[1][1] == 2 && a[0][2] == 2){
			System.out.println("Player 2 has won the game!");
			System.exit(0);
		}
		//Turn 9
		System.out.println("Player 1 turn");
		//Field Render
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + a[0][0] + "|" + a[1][0] + "|" + a[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + a[0][1] + "|" + a[1][1] + "|" + a[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + a[0][2] + "|" + a[1][2] + "|" + a[2][2] + "|");
		System.out.println("  _______");
		//Scan Args
		System.out.println("Write X and Y coords");
		string1 = scanner.nextLine();
		arg1 = string1.charAt(0) - 48;
		arg2 = string1.charAt(1) - 48;
		System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
		//Check slot
		if(a[arg1][arg2] == 0){
			a[arg1][arg2] = 1;
		}else{
			System.out.println("This coords already owned, choose another coords ");
			string1 = scanner.nextLine();
			arg1 = string1.charAt(0) - 48;
			arg2 = string1.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			if(a[arg1][arg2] == 0){
				a[arg1][arg2] = 1;
			}else{
				System.out.println("You lose your turn.");
			}
		}
		//Win params player 1
		if(a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0); 
		}else if(a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}else if(a[2][0] == 1 && a[1][1] == 1 && a[0][2] == 1){
			System.out.println("Player 1 has won the game!");
			System.exit(0);
		}
		//If draw
		if(a[0][0] != 0 && a[0][1] != 0 && a[0][2] != 0 && a[1][0] != 0 && a[2][0] != 0 && a[1][1] != 0 && a[2][2] != 0 && a[1][2] != 0 && a[2][1] != 0){
			System.out.println("Draw!");
			System.exit(0);
		}	
	}
}
