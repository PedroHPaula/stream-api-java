package main.exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        int sumOfSquares = numbers.stream()
                            //.mapToInt(n -> n*n)
                            //.reduce(0, (n1, n2) -> n1+n2);
                            .reduce(0, (n1, n2) -> n1+(n2*n2));

        System.out.println("The sum of the squares is: "+sumOfSquares);
    }
}
