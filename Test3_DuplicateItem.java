package Test4;
import java.util.*;
public class DuplicateItem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Array : ");
		int n = input.nextInt();
		int a[] = new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter the Number : ");
			a[i]= input.nextInt();
		}
		Arrays.sort(a);
		if(n==0 || n==1) {
			System.out.print("The ARRAY are : "+n);
		}
		else {
			for(int i=0;i<n-1;i++) {
				if(a[i]!=a[i+1]) {
					a[j++]=a[i];
				}
			}
		}
		a[j++]=a[n-1];
		for(int i=0;i<j;i++) {
			System.out.print(a[i]);
		}
		
		

	}

}
