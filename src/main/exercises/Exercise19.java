package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> divisiblebyThreeAndFive = numbers.stream()
                        .filter(n -> (n % 3) == 0 || (n % 5) == 0)
                        .collect(Collectors.toList());

        int sum = divisiblebyThreeAndFive.stream()
                                        .reduce(0, (n1, n2) -> n1+n2);

        System.out.print("Numbers in the list that are divisible by 3 or 5: ");
        System.out.println(divisiblebyThreeAndFive);
        System.out.println("The sum of these numbers is: "+sum);
    }
}
