package Test3;
import java.util.*;
public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = input.nextInt();
		int fact = factorial(n);
		System.out.print("The factorial of the "+n+" is : "+fact);
	}
	public static int factorial(int n) {
		if(n==1){
			return n;
		}
		else {
			return n*factorial(n-1);
		}
	}

}
