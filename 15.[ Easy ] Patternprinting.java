package collegeJavaPrograms;
import java.util.*;

public class PatternPrinting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Symbol to make the pattern : ");
		char symbol = input.next().charAt(0);
		System.out.print("Enter the limit number");
		int n = input.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}

	}

}
