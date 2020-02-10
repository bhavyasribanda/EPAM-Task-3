package EpamAss1.CalculatorProject;

import java.util.Scanner;

public class KISSPrinciple {
 
	public static double operation(double a, int op, double b){
		double n[] = {a+b,a-b,a*b,a/b};
		return n[op-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	int op = sc.nextInt();
    	System.out.println(operation(a,op,b));

	}
}
