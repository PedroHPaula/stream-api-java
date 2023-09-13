package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        int minRange = 5;
        int maxRange = 10;

        List<Integer> numbersInRange = numbers.stream()
                        .filter(n -> n > minRange && n < maxRange)
                        .collect(Collectors.toList());

        System.out.println("The numbers that fall within the specified range are:");
        System.out.println(numbersInRange);
    }
}
