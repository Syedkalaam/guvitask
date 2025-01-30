package guvitask1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		int a,b,c,smallest;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
    	
		System.out.print("Enter the first number: ");  
    	a=sc.nextInt();
    	
    	System.out.print("Enter the second number: ");
    	b=sc.nextInt();
    	
    	System.out.print("Enter the thrid number: ");
    	c=sc.nextInt();
    	
    	smallest=c<(a<b?a:b)?c:((a<b)?a:b);
    
    	System.out.println("The smallest number is:" +smallest);
	}

}
