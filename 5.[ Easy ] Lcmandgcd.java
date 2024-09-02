package collegeJavaPrograms;
import java.util.*;

public class LCMandGCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number of values going to enter : ");
		int n = input.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Number : ");
			a[i] = input.nextInt();
		}
		LCM(a);
		GCD(a);
	}
	public static void LCM(int a[]) {
		int Lcm = a[0];
		for(int i=0;i<a.length;i++) {
			Lcm = (Lcm*a[i])/GCD(Lcm,a[i]);
		}
		System.out.println("Lcm = "+Lcm);
	}
	public static void GCD(int a[]) {
		int gcd=a[0];
		for(int i=0;i<a.length;i++) {
			gcd = GCD(gcd,a[i]);
		}
		System.out.println("GCD = "+gcd);
	}
	public static int GCD(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return GCD(b,a%b);
		}
	}
}
