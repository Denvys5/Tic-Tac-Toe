package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	public static int[][] Field = new int[3][3];
	public static int winner = 0;
	public static int player = 1;
	public static int turn = 1;
	public static final Scanner scanner = new Scanner(System.in);
	public static String string;
	public static void main(String[] args){
		Screen.Frame();
		System.out.println("Rules: First player = 1; Second player = 2; Empty space = 0.");
		turns();
	}

	public static void fieldRenderer(){
		System.out.println("  |0|1|2|");
		System.out.println("  _______");
		System.out.println("0||" + Field[0][0] + "|" + Field[1][0] + "|" + Field[2][0] + "|");
		System.out.println("  _______");
		System.out.println("1||" + Field[0][1] + "|" + Field[1][1] + "|" + Field[2][1] + "|");
		System.out.println("  _______");
		System.out.println("2||" + Field[0][2] + "|" + Field[1][2] + "|" + Field[2][2] + "|");
		System.out.println("  _______");
	}
	
	public static void checkForWin(){
		if(Field[0][0] == player && Field[0][1] == player && Field[0][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer();
			System.exit(0); 
		}else if(Field[1][0] == player && Field[1][1] == player && Field[1][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer();
			System.exit(0);
		}else if(Field[2][0] == player && Field[2][1] == player && Field[2][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer();
			System.exit(0);
		}else if(Field[0][0] == player && Field[1][0] == player && Field[2][0] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer();
			System.exit(0);
		}else if(Field[0][1] == player && Field[1][1] == player && Field[2][1] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer();
			System.exit(0);
		}else if(Field[0][2] == player && Field[1][2] == player && Field[2][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer();
			System.exit(0);
		}else if(Field[0][0] == player && Field[1][1] == player && Field[2][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer();
			System.exit(0);
		}else if(Field[2][0] == player && Field[1][1] == player && Field[0][2] == player){
			System.out.println("Player " + player + " has won the game!");
			fieldRenderer();
			System.exit(0);
		}
	}
	
	public static boolean checkCoords(String string){
		if(!string.contains("0")){
			if(!string.contains("1")){
				if(!string.contains("2")){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void makeTurn(){
		//Scan Args
		System.out.println("Write X and Y coords");
		string = scanner.nextLine();
		if(checkCoords(string)){
			int arg1 = string.charAt(0) - 48;
			int arg2 = string.charAt(1) - 48;
			System.out.println("X coord = " + arg1 + " Y coord = " + arg2);
			//Check slot
			if(Field[arg1][arg2] == 0){
				Field[arg1][arg2] = player;
			}else{
				System.out.println("This coords have already owned, choose another coords ");
				fieldRenderer();
				makeTurn();
			}
		}else {
			System.out.println("Wrong coords");
			makeTurn();
		}
	}
	
	public static void checkForDraw(){
		if(turn == 9){
			if(Field[0][0] != 0 && Field[0][1] != 0 && Field[0][2] != 0 && Field[1][0] != 0 && Field[2][0] != 0 && Field[1][1] != 0 && Field[2][2] != 0 && Field[1][2] != 0 && Field[2][1] != 0){
				System.out.println("Draw!");
				fieldRenderer();
				System.exit(0);
			}
		}
	}
	
	public static void turns(){
		System.out.println("Player " + player + " turn");
		//Field Render
		fieldRenderer();
		//Actual turn
		makeTurn();
		//Win params
		if(turn >= 5){
			checkForWin();
		}
		//Check for draw
		checkForDraw();
		//Main Game Loop
		turn++;
		if(player == 1)player++;
		else if(player == 2) player--;
		turns();
	}
}
