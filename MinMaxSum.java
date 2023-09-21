package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 2, 3, 4, 5,8,7);

         calculateMinMaxSum(numbers);
    }

    public static void calculateMinMaxSum(List<Integer> numbers) {
        Collections.sort(numbers); 

        int minSum = 0;
        int maxSum = 0;

        for (int i = 0; i < numbers.size()-1; i++) {
            minSum += numbers.get(i);
        }
        for (int i = 1; i < numbers.size(); i++) {
            maxSum += numbers.get(i);
        }

       System.out.println(minSum+" "+maxSum);
    }
}