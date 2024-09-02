package collegeJavaPrograms;
import java.util.*;
public class PerfectNumberOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = input.nextInt();
		int sum =0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(n==sum) {
			System.out.println("The given number is perfect Number");
		}
		else {
			System.out.println("The given Number is not a perfect Number");
		}

	}

}
