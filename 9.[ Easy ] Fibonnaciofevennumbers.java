package collegeJavaPrograms;
import java.util.*;

public class FibonnaciOfEvenNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number for fibo : ");
		int n = input.nextInt();
		int sum =0;
		int fibo[]=new int[2*n+1];
		fibo[0]=0;
		fibo[1]=1;
		for(int i=2;i<=2*n;i++) {
				fibo[i]=fibo[i-1]+fibo[i-2];
		}
		for(int i=0;i<=2*n;i++) {
			if(i%2==0){ 
				System.out.println(" "+fibo[i]);
				sum+=fibo[i];
			}
		}
		System.out.println("the total value for the sum of even number is : "+sum);
	}

}
