import java.util.Scanner;
class Increment {
	public static Scanner scnr = new Scanner(System.in);
	public static double number, number1,number2,number3,number4,number5;
public static void main (String[] args) {
	double zero = 0;
	number = scnr.nextInt();
    number2 = scnr.nextInt();
    if(number2 >= number) {
    number3 = scnr.nextInt();
    }
    else 
    	System.out.printf("%.2f", zero);
    if(number3 >= number2) {
    number4 = scnr.nextInt();
    }
    else{
    double average = number2 - number;
    	System.out.println(average);
    }
    if(number4 >= number3) {
    number5 = scnr.nextInt();
    }
    else {
    double average = ((number2 - number) + (number3 - number2))/2;
    	System.out.printf("%.2f", average);
    }
}
}
