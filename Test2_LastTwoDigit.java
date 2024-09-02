package Test_2;
import java.util.*;
public class LastTwoDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = input.nextInt();
		String str = String.valueOf(n);;
		int len = str.length();
		int rem[] = new int [2];
		int i=0;
		if(len<=1) {
			System.out.print("You can't retrive the number");
		}
		else {
			System.out.print("The Last two Digit of the "+n+" is : ");
			for(i=0;i<2;i++) {
				rem[i]=n%10;
				n/=10;
			}
			for(int j=1;j>=0;j--) {
				System.out.print(rem[j]);
			}
		}
		
		

	}

}
