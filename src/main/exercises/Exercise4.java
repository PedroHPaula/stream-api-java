package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Default numbers list:");
        System.out.println(numbers);

        List<Integer> evenNumbers = numbers.stream()
                                        .filter(n -> (n % 2) == 0)
                                        .collect(Collectors.toList());

        System.out.println("The list without odd values is:");
        System.out.println(evenNumbers);
    }
}
