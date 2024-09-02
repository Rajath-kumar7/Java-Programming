package collegeJavaPrograms;
import java.util.*;
public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=input.nextInt();
		int num1=n;
		int arm=0;
		while(num1!=0)
		{
		 int rem=num1%10;
		 arm=arm+(rem*rem*rem);
		 num1=num1/10;
		}
		if(n==arm)
		 System.out.print("Armstrong number");
		else
		 System.out.print("Not Armstrong");


	}

}
