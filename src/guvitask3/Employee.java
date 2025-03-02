package management;

public class Employee implements Taxable {
    private int emplId;
    private String name;
    private double salary;

    public Employee(int emplId, String name, double salary) {
        this.emplId = emplId;
        this.name = name;
        this.salary = salary;
    }

    
    public int getEmplId() {
        return emplId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

   
    public double calcTax() {
       
        return salary * INCOME_TAX;
    }

 
    public String toString() {
        return "Employee ID: " + emplId + ", Name: " + name + ", Salary: " + salary;
    }
}

