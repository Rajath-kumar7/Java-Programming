package collegeJavaPrograms;
import java.util.*;

public class PrincipleAmountCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the principle amount : ");
		int principle = input.nextInt();
		System.out.print("Enter the no.of year : ");
		int time = input.nextInt();
		System.out.print("if the person is senior Citizen Enter Y -> Yes , N -> No");
		char choice = input.next().charAt(0);
		
		if(choice == 'y' || choice =='y') {
			System.out.println((principle*time*0.12));
		}
		else {
			System.out.println((principle*time*0.1));
		}

	}

}
