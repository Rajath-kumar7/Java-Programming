package collegeJavaPrograms;
import java.util.*;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number for Reverse : ");
		int Num = input.nextInt();
		int rev =0;
		while(Num!=0) {
			int rem = Num%10;
			rev=rev*10+rem;
			Num=Num/10;
		}
		System.out.println("The reverse Number is : "+rev);
	}

}
