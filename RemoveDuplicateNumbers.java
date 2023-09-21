package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateNumbers {
	
	    public static void main(String[] args) {
	        int[] array = { 1, 2, 3, 2, 4, 5, 1, 6, 3, 7 ,2};

	        int[] resultArray = removeDuplicates(array);
	        for (int num : resultArray) {
	            System.out.print(num + " ");
	        }
	    }

	    public static int[] removeDuplicates(int[] array) {
	        HashSet<Integer> set = new HashSet<>();
	        ArrayList<Integer> list = new ArrayList<>();
	        for (int num : array) {
	            if (!set.contains(num)) {
	                set.add(num);
	                list.add(num);
	            }
	        }
	        int[] resultArray = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            resultArray[i] = list.get(i);
	        }

	        return resultArray;
	    }
	}