package Test_1;
import java.util.*;
public class areaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		int r = input.nextInt();
		double area = 3.14*(r*r);
		System.out.println("The Area of the Circle is : "+area);
	}

}
