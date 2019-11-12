public class Queens {
	public static int a = 0;
	static void placeQueen(int[][] B, int i, int j) {
		B[i][j] = 1;
		B[i][0] = j;
		//column -1
		int a = 0;
		int b = i;
		while(b<B.length-1) {
			b++;
			B[b][j] = B[b][j] - 1;
		}
		//diagonal down right -1
		a = i;
		b = j;
		while(a<B.length-1 && b<B.length-1) {
			a++;
			b++;
			B[a][b] = B[a][b] - 1;
		}
		//diagonal down left -1
		a = i;
		b = j;
		while(a<B.length-1 && 1<b) {
			a++;
			b--;
			B[a][b] = B[a][b] - 1;
		}
	}

	static void removeQueen(int[][] B, int i, int j) {
		B[i][j] = 0;
		B[i][0] = 0;
		int a = i;
		int b = i;
		while(b<B.length-1) {
			b++;
			B[b][j] = B[b][j] + 1;
		}
		//diagonal down right -1
		a = i;
		b = j;
		while(a<B.length-1 && b<B.length-1) {
			a++;
			b++;
			B[a][b] = B[a][b] + 1;
		}
		//diagonal down left -1
		a = i;
		b = j;
		while(a<B.length-1 && 1<b) {
			a++;
			b--;
			B[a][b] = B[a][b] + 1;
		}
	}
	static void printBoard(int[][] B) {
		System.out.print("(");
		for(int i = 1;i <= B.length-1;i++) {
			if(i == B.length-1) {
				System.out.print(B[i][0]);
			}
			else {
				System.out.print(B[i][0] + ", ");
			}
		}
		System.out.print(")");
		System.out.println("");
	}

	static int findSolutions(int[][] B, int i, String mode) {
		if(i > B.length-1) {
			a++;
			if(mode.equals("verbose")) {
				printBoard(B);
			}
			return 1;
		}
		else {
			for(int j = 1; j<B.length;j++) {
				if(B[i][j] == 0) {
					placeQueen(B,i,j);
					findSolutions(B, i+1,mode);
					removeQueen(B,i,j);
				}
			}	
		}
		return a;
	}

	public static void main(String args[]) {
		int number = 0;
		boolean right;
		//close program if command line is not in right length
		if(args.length < 1 || args.length > 2) {
			System.err.println("Usage: Queens [-v] number"); 
			System.err.println("Option: -v verbose output, print all solutions");
			System.exit(1);
		}
		//check if it's verbose mode
		if(args.length == 1) {
			if(args[0].equals("-v")) {
				System.err.println("Usage: Queens [-v] number"); 
				System.err.println("Option: -v verbose output, print all solutions");
				System.exit(1);
			}
			try {
				number = Integer.parseInt(args[0]);
				right = true;
			}
			catch (NumberFormatException nfe) {
				right = false;
			}
			if (right == true && (1 <= Integer.parseInt(args[0])) && (Integer.parseInt(args[0]) <= 15)) {
				int n = Integer.valueOf(args[0]);
				int [][] board = new int [n+1][n+1];

				for(int i = 0;i<board.length;i++) {
					for(int j = 0; j<board.length;j++) {
						board[i][j] = 0;
					}
				}
				findSolutions(board, 1, "");
				System.out.println(n + "-Queens has " + a + " solutions");
			}
			else {
				System.err.println("Usage: Queens [-v] number"); 
				System.err.println("Option: -v verbose output, print all solutions");
				System.exit(1);
			}
		}
		else if(args.length == 2) {
			if(args[0].equals("-v")) {
				//test if the user enters an integer
				
				try {
					number = Integer.parseInt(args[1]);
					right = true;
				}
				catch (NumberFormatException nfe) {
					right = false;
				}
				//check if the integer is in right length
				if (right == true && (1 <= Integer.parseInt(args[1])) && (Integer.parseInt(args[1]) <= 15)) {   
					int n = Integer.valueOf(args[1]);
					int [][] board = new int [n+1][n+1];

					for(int i = 0;i<board.length;i++) {
						for(int j = 0; j<board.length;j++) {
							board[i][j] = 0;
						}
					}
					findSolutions(board, 1, "verbose");
					System.out.println(n + "-Queens has " + a + " solutions");
				}
				else {
					System.err.println("Usage: Queens [-v] number"); 
					System.err.println("Option: -v verbose output, print all solutions");
					System.exit(1);
				}
		}
		}
			else{
			System.err.println("Usage: Queens [-v] number"); 
			System.err.println("Option: -v verbose output, print all solutions");
			System.exit(1);
		}
	}
}