package task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Notemptystringfilter {
    public static void main(String[] args) {
               List<String> strings = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");

              List<String> nonEmptyStrings = strings.stream()
                                              .filter(str -> !str.isEmpty())
                                              .collect(Collectors.toList());

                System.out.println(nonEmptyStrings);
    }
}
