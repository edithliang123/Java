import java.util.Scanner;
class Convert{
public static void main (String[] args) {
	Scanner scnr = new Scanner(System.in);
	int clock;
	int clockhand;
	int ampm;
	clock = scnr.nextInt();
	clockhand = scnr.nextInt();
	ampm = scnr.nextInt();
	if(ampm >= 2) {
		if(clock < 12) {
			System.out.printf("%02d:%02d",clock + 12,clockhand);
	}
		else
			System.out.printf("%02d:%02d",clock,clockhand);
	}
	if(ampm <=1) {
		if(clock >=12) {
			System.out.printf("00:%02d",clockhand);
				}
		else
			System.out.printf("%02d:%02d",clock,clockhand);
	}
}
}
