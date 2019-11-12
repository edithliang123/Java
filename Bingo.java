class Bingo {
	public Player [] theplayers;
	public Bingo(Player[] players) {
		theplayers = players;
	}
	public String play(int number) {
	String winners = "";
	for(int i = 0;i < theplayers.length;i++) {
		theplayers[i].markNumber(number);
		if(theplayers[i].isWinner()) {
			winners = winners.concat(theplayers[i].getName() + " ");
		}
	}
		return winners;
	}
}
class Player {
	public String n;
	public Card [] c;
	public Player(String name, Card[] cards) {
		n = name;
		c = cards;
	}
	public String getName() {
		return n;
	}
	public Card[] getCards() {
		return c;
	}
	public boolean isWinner() { 
		boolean check = false; 
		boolean b1 = false;
		boolean b2 = false;
		boolean b3 = false;
		boolean b4 =false;
		boolean b5 = false;
		for(int g = 0;g < c.length; g++) {
		for(int w = 0; w < 5; w++) {
			if(c[g].isMarked(w,0)) {
				b1 = true;
		}
			if(c[g].isMarked(w,1)) {
				b2 = true;
		}
			if(c[g].isMarked(w,2)) {
				b3 = true;
		}
			if(c[g].isMarked(w,3)) {
				b4 = true;
		}
			if(c[g].isMarked(w,4)) {
				b5 = true;
		}
			if((b1 && b2 && b3 && b4 && b5 )== true) {
				check = true;
				return check;
			}
		b1  =false; b2 = false; b3 = false; b4 = false;b5 = false;
		
		}
		
		}
		return false;
	}
	public void markNumber(int number) {	
		for(int i = 0; i < c.length;i++) {
			c[i].markNumber(number);
			}
		}
}
class Card {
	public int bingocard [][] ;
	public boolean right;
	public Card(int[][] numbers) {
		bingocard = numbers;
	}
	public int getNumber(int Row, int Column) {
		return bingocard [Row][Column];
	}
	public boolean isMarked(int row, int column) {
		if(bingocard[row][column] == -5) {
			right = true;
		}
		else {
			right = false;
		}
		return right;
	}
	public void markNumber(int number) {
		for(int ii = 0; ii < 5;ii++) {
			for(int jj = 0; jj < 5; jj++) {
				if(bingocard [ii][jj] == number) {
					bingocard [ii][jj] = -5;
				}
			}
		}
	}
}