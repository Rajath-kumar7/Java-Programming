package collegeJavaPrograms;
import java.util.*;

public class PrintNumberMandK {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the M value : ");
		int M = input.nextInt();
		System.out.print("Enter the N value : ");
		int N = input.nextInt();
		System.out.print("Enter the K value : ");
		int K = input.nextInt();
		for(int i=M;i<=N;i=i+K+1) {
			System.out.println(" "+i);
		}
	}

}
