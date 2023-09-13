package main.exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        int totalSum = numbers.stream()
                    .reduce(0, (sum, N) -> {
                        int n = N;
                        int remainder;
                        while (n > 0) {
                            remainder = (n % 10);
                            sum += remainder;
                            n = n/10;
                        }
                        return sum;
                    });

        System.out.println("Sum of the digits of all the numbers in the list: "+totalSum);
    }
}
