package Test_2;
import java.util.*;
public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Starting Number : ");
		int n = input.nextInt();
		System.out.print("Enter the Ending Number : ");
		int m = input.nextInt();
		if(n<=0) {
			System.out.println("Sorry Wrong Input");
		}
		else {
			for(int i=n;i<=m;i++) {
				boolean amg = amstrong(i);
				if(amg==true) {
					System.out.println(i);
				}
			}
		}

	}
	public static boolean amstrong(int n) {
		int n1 = n;
		int rem,amg=0;
		while(n!=0) {
			rem = n%10;
			amg = amg+(rem*rem*rem);
			n/=10;
		}
		if(n1==amg) {
			return true;
		}
		else {
			return false;
		}		
	}

}
