package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> numbersGreaterThan5 = numbers.stream()
                                            .filter(n -> n > 5)
                                            .collect(Collectors.toList());

        long size = numbersGreaterThan5.stream()
                        .count();

        double totalSum = numbersGreaterThan5.stream()
                            .reduce(0, (n1, n2) -> (n1+n2));

        double average = totalSum/size;

        System.out.print("The list of numbers greater than 5 is: ");
        System.out.println(numbersGreaterThan5);
        System.out.print("The average is: ");
        System.out.println(average);
    }
}
