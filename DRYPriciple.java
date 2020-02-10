package EpamAss1.CalculatorProject;

import java.util.Scanner;

public class DRYPriciple {
	public static double add(double a,double b) {
		return a+b;
	}
	public static double subtract(double a, double b) {
		return add(a,-b);
	}
	public static double multiply(double a, double b) {
		double sum = 0.0;
		for(int i = 0; i < b; i++)
			sum = add(sum,a);
		return sum;
	}
	public static double divide(double a, double b) {
		double result = a;
		while(a >= b) {
			result++;
		    add(result,-b);
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	char op = sc.next().charAt(0);
    	switch(op) {
    	case '+' :	System.out.println(add(a,b));
    			    break;
    	case '-' : System.out.println(subtract(a,b));
    			   break;
    	case '*' : System.out.println(multiply(a,b));
		           break;
    	case '/' : System.out.println(divide(a,b));
		           break;
		default :System.out.println("INVALID OPERATOR");
    	}
	}

}
