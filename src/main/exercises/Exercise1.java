package main.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> orderedNumbers = numbers.stream()
                                    .sorted(Comparator.naturalOrder())
                                    .collect(Collectors.toList());

        System.out.println(orderedNumbers);
    }
}
