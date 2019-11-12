//Present a minesweeper board by given numbers and positions of bombs
import java.util.Scanner;
class Minesweeper {
public static void main (String[] args) {
	Scanner scnr = new Scanner(System.in);
	int r = scnr.nextInt();
	int c = scnr.nextInt();
	int b = 0;
	char [][] Minesweeper = new char [r][c];
	int nbomb = scnr.nextInt();
	for(int n = 0; n < nbomb;n++) {
		int w = scnr.nextInt();
		int v = scnr.nextInt();
		Minesweeper [w][v] = '*';
	}
if(Minesweeper[0][0] != '*') {
	if(Minesweeper[1][0] == '*') {
		b++;
	}
	if(Minesweeper[0][1] == '*') {
		b++;
	}
	if(Minesweeper[1][1] == '*') {
		b++;
	}
	Minesweeper[0][0] = String.valueOf(b).charAt(0);
	b = 0;
}
if(Minesweeper[r-1][c-1] != '*') {
	if(Minesweeper[r-2][c-1] == '*') {
		b++;
	}
	if(Minesweeper[r-2][c-2] == '*') {
		b++;
	}
	if(Minesweeper[r-1][c-2] == '*') {
		b++;
	}
	Minesweeper[r-1][c-1] = String.valueOf(b).charAt(0);
	b = 0;
}
if(Minesweeper[0][c-1] != '*') {
	if(Minesweeper[0][c-2] == '*') {
		b++;
	}
	if(Minesweeper[1][c-2] == '*') {
		b++;
	}
	if(Minesweeper[1][c-1] == '*') {
		b++;
	}
	Minesweeper[0][c-1] = String.valueOf(b).charAt(0);
	b = 0;
}
if(Minesweeper[r-1][0] != '*') {
	if(Minesweeper[r-2][0] == '*') {
		b++;
	}
	if(Minesweeper[r-2][1] == '*') {
		b++;
	}
	if(Minesweeper[r-1][1] == '*') {
		b++;
	}
	Minesweeper[r-1][0] = String.valueOf(b).charAt(0);
	b = 0;
}
//four points



for(int i = 1;i < (c-1);i++) {
	if(Minesweeper[0][i] != '*') {
		if(Minesweeper[0][i+1] == '*') {
			b++;
		}
		if(Minesweeper[0][i-1] == '*') {
			b++;
		}
		if(Minesweeper[1][i+1] == '*') {
			b++;
		}
		if(Minesweeper[1][i-1] == '*') {
			b++;
		}
		if(Minesweeper[1][i] == '*') {
			b++;
		}
		Minesweeper[0][i] = String.valueOf(b).charAt(0);
		b = 0;
		}
}
for(int j = 1;j < (r-1);j++) {
	if(Minesweeper[j][0] != '*') {
		if(Minesweeper[j-1][0] == '*') {
			b++;
		}
		if(Minesweeper[j+1][0] == '*') {
			b++;
		}
		if(Minesweeper[j-1][1] == '*') {
			b++;
		}
		if(Minesweeper[j][1] == '*') {
			b++;
		}
		if(Minesweeper[j+1][1] == '*') {
			b++;
		}
		Minesweeper[j][0] = String.valueOf(b).charAt(0);
		b = 0;
	}
}
for(int j = 1;j < (r-1);j++) {//right
if(Minesweeper[j][c-1] != '*') {
	if(Minesweeper[j-1][c-1] == '*') {
		b++;
	}
	if(Minesweeper[j-1][c-2] == '*') {
		b++;
	}
	if(Minesweeper[j][c-2] == '*') {
		b++;
	}
	if(Minesweeper[j+1][c-1] == '*') {
		b++;
	}
	if(Minesweeper[j+1][c-2] == '*') {
		b++;
	}
	Minesweeper[j][c-1] = String.valueOf(b).charAt(0);
	b = 0;
	}
}
for(int i = 1;i < (c-1);i++) {
	if(Minesweeper[r-1][i] != '*') {
		if(Minesweeper[r-2][i+1] == '*') {
			b++;
		}
		if(Minesweeper[r-2][i-1] == '*') {
			b++;
		}
		if(Minesweeper[r-1][i+1] == '*') {
			b++;
		}
		if(Minesweeper[r-1][i-1] == '*') {
			b++;
		}
		if(Minesweeper[r-2][i] == '*') {
			b++;
		}
		Minesweeper[r-1][i] = String.valueOf(b).charAt(0);
		b = 0;
		}
}
//four sides
for(int i = 1; i < (r-1);i++) {
	for(int j = 1; j < (c-1);j++) {
		if(Minesweeper[i][j] != '*') {
			if(Minesweeper[i-1][j-1] == '*') {
				b++;
			}
			if(Minesweeper[i-1][j] == '*') {
				b++;
			}
			if(Minesweeper[i-1][j+1] == '*') {
				b++;
			}
			if(Minesweeper[i][j+1] == '*') {
				b++;
			}
			if(Minesweeper[i][j-1] == '*') {
				b++;
			}
			if(Minesweeper[i+1][j+1] == '*') {
				b++;
			}
			if(Minesweeper[i+1][j] == '*') {
				b++;
			}
			if(Minesweeper[i+1][j-1] == '*') {
				b++;
			}
			Minesweeper[i][j] = String.valueOf(b).charAt(0);
			b = 0;
			}
	}
}
for(int i = 0;i < r;i++) {
	for(int j = 0; j < c;j++) {
		if(j >= 1) {
		System.out.print(' ');
		}
		System.out.print(Minesweeper [i][j]);
		}
	System.out.println("");
	}
}
}
