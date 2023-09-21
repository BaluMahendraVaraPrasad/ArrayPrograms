package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonInSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 62, 54, 8};
		int[] arr2 = {1, 2, 3, 12, 9, 6, 7, 8};
		int[] arr3 = {16, 21, 11, 4, 5, 6, 7, 8};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		List<Integer> list = commonEle(arr1, arr2, arr3);
		System.out.println(list);
		
		
	}
	public static List<Integer> commonEle(int[] arr1,int[] arr2,int[] arr3) {
		 List<Integer> commonElements = new ArrayList<>();

	        int i = 0, j = 0, k = 0;

	        while (i < arr1.length && j < arr2.length && k < arr3.length) {
	            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
	                commonElements.add(arr1[i]);
	                i++;
	                j++;
	                k++;
	            } else if (arr1[i] < arr2[j]) {
	                i++;
	            } else if (arr2[j] < arr3[k]) {
	                j++;
	            } else {
	                k++;
	            }
	        }

	        return commonElements;
	}
}

