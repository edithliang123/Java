import java.util.Scanner;
class Cost {
public static void main (String[] args) {
	Scanner scnr = new Scanner(System.in);
	double milesDriven;
	double fuelEfficiency;
	double costgasoline;
	milesDriven = scnr.nextDouble(); 
    fuelEfficiency = scnr.nextDouble();
    costgasoline = scnr.nextDouble();     
    double output_variable = milesDriven / fuelEfficiency * costgasoline;
    System.out.printf("%.2f",output_variable); 
}
}

