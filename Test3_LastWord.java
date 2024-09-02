package Test4;
import java.util.*;
public class LastWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = input.nextLine();
		int len = str.length();
		String[] words  = str.split(" ");
		String lastWord = words[words.length-1];
		int wordsLen = lastWord.length();
		System.out.println("The last word of the string is : "+words[words.length-1]+" And the is have length of: "+wordsLen);

	}

}
