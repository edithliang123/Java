import java.util.Scanner;
class Flip {
public static void main (String[] args) {
	Scanner scnr = new Scanner(System.in);
	int integer;
	integer = scnr.nextInt();
	int integer2 = integer%10;
	int integer3 = (integer/10)%10;
	int integer4 = (integer/100)%10;
if(integer%10 == 0) {
	if((integer%100) == 0) {
		System.out.println(integer4 + "00");
	}
	else
	System.out.println(integer3 + "" + integer4 + "0");
}
	else
System.out.println(integer2 + "" + integer3 + "" + integer4);
}
}
