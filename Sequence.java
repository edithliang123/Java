import java.util.Scanner;
class Sequence {
public static void main (String[] args) {
	Scanner scnr = new Scanner(System.in);
	int a, b, c;
	a = scnr.nextInt();
	b = scnr.nextInt();
	c = scnr.nextInt();
	int j = 0;
	int i;
	int number = c;
	i = scnr.nextInt();
	if(i == 3) {
		System.out.print(a + " " + b + " " + c);
	}
		else {
			System.out.print(a + " " + b + " " + c);
			for(j = 1;j <= (i - 3);j++){
			if (j%2 == 0) {
				number = number + subtract(b,c);
				System.out.print(" " + number);
			}
			else if(j%2 != 0) {
				number = number + subtract(a,b);
				System.out.print(" " + number);
			}
			}
			}
		}
public static int subtract(int v, int w) {
	int result = w - v;
	return result;
}
}
