package collegeJavaPrograms;
import java.util.*;

public class AscendingAndDescendingOrder {
	public static void main(String[] Args){
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice \n For Ascending Order type A \n "
				+ "For Decending Order type D");
		 char choice = input.next().charAt(0);
		 System.out.println("Enter the number of data : ");
		 int Num = input.nextInt();
		 String Arr[] = new String[Num];
		 for(int i=0;i<Num;i++) {
			 System.out.print("Enter the Data : ");
			 Arr[i]=input.next();
		 }
		 if(choice == 'a' || choice == 'A') {
			 for(int i=0;i<Num;i++) {
				 for(int j=i+1;j<Num;j++) {
					 if(Arr[i].compareTo(Arr[j])>0) {
						 String Temp = Arr[i];
						 Arr[i]=Arr[j];
						 Arr[j]=Temp;
					 }
				 }
			 }
			 for(int i=0;i<Num;i++) {
				 System.out.print(" "+Arr[i]);
			 }
		 } 
		 else if(choice == 'd' || choice == 'D') {
			 for(int i=0;i<Num;i++) {
				 for(int j=i+1;j<Num;j++) {
					 if(Arr[i].compareTo(Arr[j])<0) {
						 String Temp = Arr[i];
						 Arr[i]=Arr[j];
						 Arr[j]=Temp;
					 }
				 }
			 }
			 for(int i=0;i<Num;i++) {
				 System.out.print(" "+Arr[i]);
			 }
		 }
		 else {
			 System.out.println("Wrong Input");
		 }
		 
	}
		
}
