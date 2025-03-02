package guvitask1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int num;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
    	System.out.print("Enter a number: ");  
    	num = sc.nextInt();  
    	
		int rev=0;
		while(num!=0) {
			int r=num%10;
			rev=(rev*10)+r;
			num=num/10;
		}
		System.out.println(rev);

	}

}
