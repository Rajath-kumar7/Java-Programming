package Test3;
import java.util.*;
public class FibonaaciSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number limit : ");
		int n = input.nextInt();
		fibonaaci(n);

	}
	public static void fibonaaci(int n) {
		int n1=0,n2=1,next=0;
		for(int i=0;i<=n;i++) {
			if(i<=1){
				System.out.print(i+" ");
			}
			else {
				next = n1+n2;
				System.out.print(next+" ");
				n1=n2;
				n2=next;
			}
		}
	}
}
