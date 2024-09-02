package collegeJavaPrograms;
import java.util.*;
public class CheckUserName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the UserName : ");
		String UserName = input.next();
		System.out.print("Re-Enter the UserName : ");
		String ReUserName = input.next();
		if(UserName.equals(ReUserName)) {
			System.out.println("UserName is Valid");
		}
		else {
			System.out.println("UserName is Not Valid");
		}
	}

}
