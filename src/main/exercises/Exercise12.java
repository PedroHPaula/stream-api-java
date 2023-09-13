package main.exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        int totalProduct = numbers.stream()
                            .reduce(1, (n1, n2) -> (n1*n2));

        System.out.println("The product of all the numbers in the list is: "+totalProduct);
    }
}
