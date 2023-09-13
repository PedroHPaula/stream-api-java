package main.exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        boolean allEqual = numbers.stream()
                            .allMatch(n -> n == numbers.get(0));

        if (allEqual) {
            System.out.println("All numbers in the list are equal");
        } else {
            System.out.println("The list contains at least one distinct number");
        }
    }
}
