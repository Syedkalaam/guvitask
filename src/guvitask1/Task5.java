package guvitask1;

public class Task5 {

	public static void main(String[] args) {
double purchase=5200;
		
		double discount;
		
		
		if(purchase<500) {
			discount=0;
		}else if(purchase<=1000) {
			discount=10;
		}else  {
			discount=20;
		}
		
		System.out.println("Total bill generated: "+purchase);
		System.out.println("Discount applied"+discount+"%");
		System.out.println("Amount to be paid: "+(purchase-(purchase*discount)/100));
	}

}
