package collegeJavaPrograms;
import java.util.*;
public class SumOfTheNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=input.nextInt();
		int sum=0;
		while(n!=0)
		{
		 int rem=n%10;
		 sum=sum+rem;
		 n=n/10;
		}
		System.out.println(sum);

	}

}
