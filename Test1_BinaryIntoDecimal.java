package Test_1;
import java.util.*;
public class BinaryIntoDecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Binary Number : ");
		int n = input.nextInt();
        int decimalNumber = binaryToDecimal(n);
        System.out.println("The decimal equivalent of binary "+n+ " is: "+decimalNumber);
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while(binary != 0) {
            int temp = binary % 10;
            decimal += temp * Math.pow(2, n);
            binary = binary / 10;
            n++;
        }
        return decimal;
    }

}
