package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> negativeNumbers = numbers.stream()
                                        .filter(n -> n < 0)
                                        .collect(Collectors.toList());
                                        
        if (negativeNumbers.isEmpty()) {
            System.out.println("There are no negative numbers in the list");
        } else {
            System.out.println("There is at least one negative number in the list");
        }
    }
}
