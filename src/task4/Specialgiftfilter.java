package task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Specialgiftfilter {
    public static void main(String[] args) {
               List<String> students = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Alex", 
                                              "David", "Afla", "fahana", "Arun", "shaba");

        List<String> specialGiftStudents = students.stream()
                                                   .filter(name -> name.startsWith("A"))
                                                   .collect(Collectors.toList());

        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
}
