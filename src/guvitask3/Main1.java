package management;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter Employee ID: ");
        int emplId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        
        Employee employee = new Employee(emplId, name, salary);
        
       ;
        System.out.print("\nEnter Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();

        
        Product product = new Product(pid, price, quantity);

       
        System.out.println("\nEmployee Details:");
        System.out.println(employee);

        double incomeTax = employee.calcTax(); 
        System.out.println("Calculated Income Tax (10.5%): " + incomeTax);
        System.out.println("Sales Tax for Product with ID " + pid + ": " + product.calcTax());
        scanner.close();
    }
}
