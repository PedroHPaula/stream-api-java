package main.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Default numbers list: ");
        System.out.println(numbers);

        List<Integer> orderedNumbers = numbers.stream()
                                        .distinct()
                                        .sorted()
                                        .collect(Collectors.toList());

        List<Integer> primeNumbers = orderedNumbers.stream()
                                    .filter(n -> {
                                        if (n == 1) {
                                            return false;
                                        } else {
                                            int k = n-1;
                                            boolean prime = false;
                                            while(k > 1){ 
                                                if (n % k == 0) {
                                                    return prime;
                                                }
                                                k--;
                                            }
                                            prime = true;
                                            return prime;
                                            }
                                    })
                                    .collect(Collectors.toList());
        
        int largestPrime = primeNumbers.get(primeNumbers.size()-1);
        
        System.out.println("The largest prime number in the list is: "+largestPrime);
    }
}
