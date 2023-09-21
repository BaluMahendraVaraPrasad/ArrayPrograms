package com.Array.pack;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> matrix) {
        int n = matrix.size();
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix.get(i).get(i);
            secondarySum += matrix.get(i).get(n - 1 - i);
        }

        return Math.abs(primarySum - secondarySum);
    }
	 public static int diagonalDifference(int[][]a) {
		 int primarySum=0;
		 int secondarySum=0;
		 for(int i=0;i<a.length;i++) {
			primarySum+=a[i][i];
			secondarySum+=a[i][a.length-i-1];
	 }
		 return Math.abs(primarySum-secondarySum);
	 }

    public static void main(String[] args) {
        // Example matrix
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
    	int[][]a= {{1,2,3},
    			   {4,6,6},
    			   {7,8,4}};
    	int difference = diagonalDifference(a);
        System.out.println("Diagonal difference: " + difference);
    	
    	}
    

    
        
    }
