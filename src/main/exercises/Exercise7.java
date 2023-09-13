package main.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> newList = numbers.stream()
                                .distinct()
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());

        System.out.println("The list of numbers in descending order and without duplicity is: ");
        System.out.println(newList);
        System.out.print("The second largest number is: ");
        System.out.println(newList.get(1));
    }
}
