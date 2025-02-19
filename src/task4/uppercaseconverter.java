package task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class uppercaseconverter {
    public static void main(String[] args) {
        
        Stream<String> names = Stream.of("abc", "d", "ef");

        
        List<String> upperCaseNames = names.map(String::toUpperCase)
                                           .collect(Collectors.toList());

     
        System.out.println(upperCaseNames);
    }
}


