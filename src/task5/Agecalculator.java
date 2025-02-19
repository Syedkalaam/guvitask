package task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();
  
        LocalDate birthdate = LocalDate.parse(input);
        LocalDate today = LocalDate.now();
           Period age = Period.between(birthdate, today);
 
        System.out.printf("Your age is: %d years, %d months, and %d days.%n", 
                          age.getYears(), age.getMonths(), age.getDays());
        
        scanner.close();
    }
}