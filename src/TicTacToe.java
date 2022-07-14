import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of gamer1");
		String p1 = sc.nextLine();
		System.out.print("Enter name of gamer2");
		String p2 = sc.nextLine();

		// tic tac toe board//

		char[][] board = new char[3][3];

		// Board with dash//
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		
		gameboard(board);
		boolean gamer1=true;
		
		
		char input =  ' ';
		if(gamer1) {
			input ='x';
		}
		else {
			input='o';
			}
		System.out.println("enter row from 0,1,2: ");
		int row=sc.nextInt();
		System.out.println("enter column from 0,1,2: ");
		int column=sc.nextInt();
		if(row<0 || row<2|| r)
	}
	
	public static void gameboard(char[][] board) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
