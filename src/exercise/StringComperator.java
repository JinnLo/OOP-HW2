package exercise;

import java.util.Scanner;

public class StringComperator {

		
		public static void main(String[]args){
			
			Scanner scanner=new Scanner(System.in);
			int flag=0;
			String one,two;
			do{
			System.out.println("��J�r��");
			
			one =scanner.next();
			
			System.out.println("��J�r��2");
			
			two = scanner.next();
			
			if(one.compareTo(two)==0){
				
				System.out.println("�@��");
				flag =1;
			}
			else{
				
				System.out.println("���@��");
				
				
			}
			}while(flag==0);
		}

	}

