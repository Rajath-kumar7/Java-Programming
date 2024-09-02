package Test_1;
import java.util.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The height value : ");
		int h = input.nextInt();
		System.out.print("Enter the Base value : ");
		int b = input.nextInt();
		double Triangle = 0.5*b*h;
		System.out.print("The Area of the Triange is : "+Triangle);

	}

}
