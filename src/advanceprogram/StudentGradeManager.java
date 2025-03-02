package advanceprogram;

	import java.util.HashMap;
	import java.util.Scanner;

	public class StudentGradeManager {

	   	    private HashMap<String, Integer> studentGrades;

	    	    public StudentGradeManager() {
	        studentGrades = new HashMap<>();
	    }

	    	    public void addStudent(String name, int grade) {
	        studentGrades.put(name, grade);
	        System.out.println("Student " + name + " added with grade " + grade + ".");
	    }

	    public void removeStudent(String name) {
	        if (studentGrades.containsKey(name)) {
	            studentGrades.remove(name);
	            System.out.println("Student " + name + " removed.");
	        } else {
	            System.out.println("Student " + name + " not found.");
	        }
	    }

	 	    public void displayGrade(String name) {
	        if (studentGrades.containsKey(name)) {
	            int grade = studentGrades.get(name);
	            System.out.println("Grade of " + name + ": " + grade);
	        } else {
	            System.out.println("Student " + name + " not found.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        StudentGradeManager manager = new StudentGradeManager();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add a new student");
	            System.out.println("2. Remove a student");
	            System.out.println("3. Display a student's grade");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 
	            switch (choice) {
	                case 1:
	                     System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter student grade: ");
	                    int grade = scanner.nextInt();
	                    manager.addStudent(name, grade);
	                    break;

	                case 2:
	                     System.out.print("Enter student name to remove: ");
	                    String removeName = scanner.nextLine();
	                    manager.removeStudent(removeName);
	                    break;

	                case 3:
	                	System.out.print("Enter student name to display grade: ");
	                    String displayName = scanner.nextLine();
	                    manager.displayGrade(displayName);
	                    break;

	                case 4:
	                     System.out.println("Exiting program...");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice! Please select a valid option.");
	            }
	        }
	    }
	}



