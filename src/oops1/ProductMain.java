package oops1;
import java.util.Scanner;
public class ProductMain {

	public double total(Product1[] products) {
		 double total_Amount = 0;
	        for (int i = 0;i<products.length;i++) {
	            total_Amount += products[i].price * products[i].quantity;
	        }
	        return total_Amount;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Product1[] products = new Product1[5];
	//Here the for loop is used to getting five input from user and then stored in array 
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the product : "+(i+1));
			
			System.out.print("ProductID : ");
			int pid = sc.nextInt();
			System.out.print("Price : ");
			double price = sc.nextDouble();
			System.out.print("Quantity : ");
			int quantity = sc.nextInt();
			System.out.println();
			products[i] = new Product1(pid,price,quantity);
		}
		
	//Here the for loop is used to find the highest price product ID 
		Product1 highest_price = products[0];

		
		for (int i = 1;i<products.length;i++) {
			if(products[i].price * products[i].quantity> highest_price.price * highest_price.quantity) {
				highest_price = products[i];
			}
	
		}
		ProductMain product = new ProductMain();
		double total_amount=product.total(products);
	
		System.out.println();
		System.out.println("Highest price Product ID : " + highest_price.pid);
	    System.out.println("Total amount spent on all the products : " + total_amount);

	}

}