package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise16 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> oddNumbers = numbers.stream()
                                    .filter(n -> (n % 2) != 0)
                                    .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                                    .filter(n -> (n % 2) == 0)
                                    .collect(Collectors.toList());

        System.out.println("Odd numbers of the list: "+oddNumbers);
        System.out.println("Even numbers of the list: "+evenNumbers);
    }
}
