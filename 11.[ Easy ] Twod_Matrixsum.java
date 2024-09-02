package collegeJavaPrograms;
import java.util.*;

public class TwoD_MatrixSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and colums : ");
		int n = input.nextInt();
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Enter the a["+i+"]["+j+"] : ");
				a[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Enter the b["+i+"]["+j+"] : ");
				b[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]= a[i][j]+b[i][j];
			}
		}
		System.out.println("The sum of the matrix ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
