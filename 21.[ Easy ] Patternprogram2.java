package collegeJavaPrograms;
import java.util.*;

public class patternProgram2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Design : ");
		char symbol = input.next().charAt(0);
		System.out.print("Enter the No of Rows : ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}		
	}

}
