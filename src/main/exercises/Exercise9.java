package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> numbersWithoutDuplicity = numbers.stream()
                                                .distinct()
                                                .collect(Collectors.toList());
                                        
        if (numbers.equals(numbersWithoutDuplicity)) {
            System.out.println("All the numbers in the list are distinct");
        } else {
            System.out.println("The list contains at least one repeated number");
        }
    }
}
