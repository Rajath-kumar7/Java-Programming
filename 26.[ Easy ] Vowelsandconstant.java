package collegeJavaPrograms;
import java.util.*;
public class VowelsAndConstant {
	public static void main(String[] Args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the String : ");
		String name=input.nextLine();
		int len=name.length();
		char a[]=new char[len];
		char vow[]=new char[len];
		char con[]=new char[len];
		int v=0,c=0;
		for(int i=0;i<len;i++)
		{
		 a[i]=name.charAt(i);
		 if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'
		 ||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
		 vow[v] = a[i];
		 v++;
		 }
		 else {
		 con[c] = a[i];
		 c++;
		 }
		}
		System.out.print("Consonants: ");
		for(int i=0;i<v;i++)
		{
		 System.out.print(vow[i]);
		}
		System.out.print("\nvowels: ");
		for(int j=0;j<c;j++)
		{
		 System.out.print(con[j]);
		}
	}
}
