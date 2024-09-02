package collegeJavaPrograms;
import java.util.*;
public class NthOddNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=input.nextInt();
		int arr[]=new int[100];
		int j=1;
		for(int i=1;i<100;i++)
		{
		 if(i%2!=0) {
		 arr[j] = i;
		 j++;
		 }
		}
		System.out.print("The Odd number after "+n+"odd Number is :"+arr[n*2]);

	}

}
