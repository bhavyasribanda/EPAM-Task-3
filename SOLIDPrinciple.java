package EpamAss1.CalculatorProject;

import java.util.Scanner;

public class SOLIDPrinciple extends Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation o = new SOLIDPrinciple();
		Scanner sc = new Scanner(System.in);
    	double a[] = new double[2];
    	for(int i = 0; i < 2; i++)
    		a[i]= sc.nextDouble();
    	char op = sc.next().charAt(0);
    	switch(op) {
    	case '+' :	System.out.println(o.add(a[0],a[1]));
    			    break;
    	case '-' : System.out.println(o.subtract(a[0],a[1]));
    			   break;
    	case '*' : System.out.println(o.multiply(a[0],a[1]));
		           break;
    	case '/' : System.out.println(o.divide(a[0],a[1]));
		           break;
		default :System.out.println("INVALID OPERATOR");

    	}
	}

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
