package exercise;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args){
		int number=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer:");
		number = scanner.nextInt();
		
		if(number%2 == 0){
			System.out.println("This is Evne");
		}
		else
			System.out.println("This is Odd");
		
	}
}
