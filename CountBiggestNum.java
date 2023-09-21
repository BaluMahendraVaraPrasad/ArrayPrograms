package arrays;

import java.util.List;

public class CountBiggestNum {
	    public static int biggestnumber(List<Integer> a) {
	        int max = Integer.MIN_VALUE;
	        int count = 0;

	        for (int height : a) {
	            if (height > max) {
	                max = height;
	                count = 1;
	            } else if (height == max) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        List<Integer> big = List.of(3, 4, 2, 4, 4, 3,8);
	        int a = biggestnumber(big);
	        System.out.println("Number of biggest numbers: " + a);
	    }
}
