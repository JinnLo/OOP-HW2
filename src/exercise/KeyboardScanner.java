package exercise;
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args){
		
		int enterInt;
		float enterfloat,Sum;
		String enterName;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer:");
		
		enterInt = scanner.nextInt();
		System.out.println("Enter a float number:");
	
		enterfloat = scanner.nextFloat();
		System.out.println("Enter your name:");
		
		enterName = scanner.next();
		Sum = (float)enterInt*enterfloat;
		System.out.printf("Hi!"+enterName+" the multiplication of "+enterInt+" and "+enterfloat+"is %e",Sum);
		
		
		
		
	}
	
}
