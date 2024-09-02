package collegeJavaPrograms;
import java.util.*;

public class ReverseALoop {
	public static void main(String[] Args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String User = input.next();
		String Rev = "";
		int n = User.length();
		for(int i=n-1;i>=0;i--) {
			Rev = Rev+User.charAt(i);
		}
		System.out.println(Rev);
	}
}
