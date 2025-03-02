package oops1;

public class Account {
	
	    private double balance;

	  
	    public Account() {
	        this.balance = 0.0;
	    }

	   
	    public Account(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative.");
	            this.balance = 0.0; 
	        }
	    }

	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            this.balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= this.balance) {
	                this.balance -= amount;
	                System.out.println("Withdrew: $" + amount);	
	            } else {
	                System.out.println("Insufficient balance for withdrawal.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	   
	    public void displayBalance() {
	        System.out.println("Current Balance: $" + this.balance);
	    }

	  
	    public static void main(String[] args) {
	      
	        Account account1 = new Account();
	        account1.deposit(5000);
	        account1.withdraw(2000);
	        account1.displayBalance();

	       
	        Account account2 = new Account(100000);
	        account2.deposit(2000);
	        account2.withdraw(5000);
	        account2.displayBalance();
	    }
	}


