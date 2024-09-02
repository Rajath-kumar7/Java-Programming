package collegeJavaPrograms;
import java.util.*;
public class VowelsStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the statement : ");
		String str = input.nextLine();
		int len = str.length();
		int count=0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U'){
				count++;
			}
		}
		System.out.println("There are "+count+" vowels in statement");
	}

}
