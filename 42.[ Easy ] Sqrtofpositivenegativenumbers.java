package collegeJavaPrograms;
import java.util.*;
public class SqrtOfPositiveNegativeNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		 double n=input.nextInt();
		 double sqrt=Math.pow(n,0.5);
		 double sq=Math.sqrt(n);
		 System.out.println(sqrt+","+"-"+sqrt);

	}

}
