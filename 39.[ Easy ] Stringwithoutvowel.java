package collegeJavaPrograms;
import java.util.*;
public class StringWithoutVowel {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String name=input.nextLine();
		String n1=name.replaceAll("[aeiouAEIOU]","");
		System.out.println(n1);

	}

}
