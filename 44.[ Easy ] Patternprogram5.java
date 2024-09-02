package collegeJavaPrograms;
import java.util.*;
public class PatternProgram5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=input.nextInt();
		for(int i=n;i>=1;i--)
		{
		 for(int j=0;j<n-i;j++)
		 {
		 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		 {
		 System.out.print(" *");
		 }
		 System.out.println();
		}

	}

}
