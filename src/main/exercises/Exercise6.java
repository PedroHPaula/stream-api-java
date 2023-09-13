package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> numbersGreaterThan10 = numbers.stream()
                                            .filter(n -> n > 10)
                                            .collect(Collectors.toList());

        System.out.print("Quantity of numbers that are greater than 10: ");
        System.out.println(numbersGreaterThan10.size());
    }
}
