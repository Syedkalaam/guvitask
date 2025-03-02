package task5;

import java.util.*;
import java.util.stream.Collectors;

public class studentfilter {
    public static void main(String[] args) {
       
        List<String> students = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Annie", "David", "Aria", "Ethan", "Ava", "George");
        
        List<String> filteredStudents = students.stream()
                                               .filter(name -> name.startsWith("A"))
                                               .collect(Collectors.toList());
        
        System.out.println("Students whose names start with 'A': " + filteredStudents);
    }
}
