package collegeJavaPrograms;
import java.util.*;
public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give the input like this : DD/MM/YYYY");
		System.out.print("Enter the year : ");
		String date = input.next();
		String a[] = date.split("/"); 
		
		int year = Integer.parseInt(a[2]);
		System.out.println("year = "+year);
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The Given year is : Leap Year");
		}
		else {
			System.out.println("The Given year is Not a Leap Year");
		}
		
	}

}
