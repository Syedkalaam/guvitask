package advanceprogram;

public class StudentManagementSystem {
	
	    public static void main(String[] args) {
	        try {
	            // Trying to create a student with an invalid age
	            student student1 = new student(101, "John ", 22, "Computer Science");
	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        try {
	            // Trying to create a student with an invalid name
	            student student2 = new student(102, "arun@123", 20, "Mathematics");
	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        try {
	            // Creating a student with valid data
	            student student3 = new student(103, "maya", 19, "Physics");
	            System.out.println("Student " + student3.getName() + " has been successfully enrolled.");
	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}



