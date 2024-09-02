package Test_2;
import java.util.*;
public class SumOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the limit number : ");
		int n = input.nextInt();
		int sum =0;
		sum = SumOfNumber(n);
		System.out.print("The sum of the number from 0 to "+n+" is : "+sum);
	}
	public static int SumOfNumber(int n) {
		if(n!=0) {
			return n+SumOfNumber(n-1);
		}
		else {
			return n;
		}
		
			
	}

}
