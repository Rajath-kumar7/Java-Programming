package collegeJavaPrograms;
import java.util.*;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Matrix length Row And Column : ");
		int n = input.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Enter the A["+i+"]["+j+"] : ");
				a[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Enter the B["+i+"]["+j+"] : ");
				b[i][j]=input.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=0;
				for(int k=0;k<n;k++) {
					c[i][j] = c[i][j] + (a[i][k]*b[k][j]); 
				}
				System.out.print(c[i][j]+"  ");
			}
			System.out.print("\n");
		}
		
	}

}
