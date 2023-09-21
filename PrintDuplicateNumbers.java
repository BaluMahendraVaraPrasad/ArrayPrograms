package arrays;

public class PrintDuplicateNumbers {

	 public static void main(String[] args) {
	        int[] array = {1,2,3,4,1,2,3,3,1};

	        boolean[] temp = new boolean[array.length];

	        System.out.println("Duplicate elements in the array: ");
	        for (int i = 0; i < array.length - 1; i++) {
	            if (!temp[i]) {
	                for (int j = i + 1; j < array.length; j++) {
	                    if (array[i] == array[j]) {
	                        temp[j] = true;
	                        System.out.print(array[i] + " ");
	                        break;
	                    }
	                }
	            }
	        }
	    }	
	}
