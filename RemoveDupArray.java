package arrays;

import java.util.Arrays;

public class RemoveDupArray {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 1, 4};
        
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[length - 1];
                    length--; 
                    j--; 
                }
            }
        }
        
        int[] uniqueArray = Arrays.copyOf(array, length);
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
