package arrays;

import java.util.Arrays;

public class UniqueElements {
	
	    public static void main(String[] args) {
	        int[] array = {1,2,3,4,5,1,2,3};
	        
	        Arrays.sort(array);
	        
	        for(int i=0;i<array.length;i++) {
	            if(i==0 || array[i]!=array[i-1]) {
	                System.out.print(array[i]+" ");
	            }
	        }
	    }
}
