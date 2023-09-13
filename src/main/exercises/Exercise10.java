package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> multiples = numbers.stream()
                    .filter(n -> (n % 3) == 0 || (n % 5) == 0)
                    .collect(Collectors.toList());

        System.out.println("The list of numbers that are multiples of 3 or 5 is:");
        System.out.println(multiples);
    }
}
