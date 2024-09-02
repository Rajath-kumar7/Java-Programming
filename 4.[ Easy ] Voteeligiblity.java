package collegeJavaPrograms;
import java.util.*;
public class VoteEligiblity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = input.nextInt();
		String out = (age>=18)? "You are eligible for Vote" : 
				("you are not eligible for vote \n" +(18-age)+" year left for vote");
		System.out.println(out);
	}

}
