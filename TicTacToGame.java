package game;

public class TicTacToeGame {
	
	static char board[];    // declaring an array
	 public static void main(String[] args) {
		 createBoard();
		
	}

	//  Creating empty tic-tac-toe board
	    public static void createBoard() {
	        board = new char[10];   // creating an array

	        
	        for (int i = 1; i < board.length; i++) {
	            board[i] = ' ';
	        }
	    }



}
