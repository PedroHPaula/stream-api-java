package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> positiveNumbers = numbers.stream()
                                        .filter(n -> n > 0)
                                        .collect(Collectors.toList());

        if (numbers.equals(positiveNumbers)) {
            System.out.println("All the numbers in the list are positive");
        } else {
            System.out.println("There are 1 or more numbers in the list that are not positive");
        }

    }
}
