package collegeJavaPrograms;
import java.util.*;
public class codingTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the NUmber : ");
		int n = input.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of the given number is : "+fact);

	}

}
