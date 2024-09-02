package collegeJavaPrograms;
import java.util.*;

public class MeanMedianMode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number of array : ");
		int n = input.nextInt();
		int a[] = new int[n];
		int mean =0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter the number : ");
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			mean+= a[i];
		}
		System.out.println("The mean value is = "+mean/n);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		if(n%2==0) {
			System.out.println("The Median value is : "+(a[n/2]+a[n/2+1]));
		}
		else {
			System.out.println("the Median value is : "+a[n/2]);
		}
	}

}
