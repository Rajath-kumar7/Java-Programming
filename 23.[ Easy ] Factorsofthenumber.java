package collegeJavaPrograms;
import java.util.*;
public class FactorsOfTheNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = input.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("The factors of the Number "+n+" is : "+count);
	}

}
