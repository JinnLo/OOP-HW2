package exercise;

import java.util.Scanner;

public class StringComperator {

		
		public static void main(String[]args){
			
			Scanner scanner=new Scanner(System.in);
			int flag=0;
			String one,two;
			do{
			System.out.println("輸入字串");
			
			one =scanner.next();
			
			System.out.println("輸入字串2");
			
			two = scanner.next();
			
			if(one.compareTo(two)==0){
				
				System.out.println("一樣");
				flag =1;
			}
			else{
				
				System.out.println("不一樣");
				
				
			}
			}while(flag==0);
		}

	}

