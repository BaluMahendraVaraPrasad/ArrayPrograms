package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupliInTwoArrays2 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,8,9};
		int[]b= {1,2,3,4,5,6,7};
		int[]c=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length) {
			c[k++]=a[i++];
		}while(j<b.length) {
			c[k++]=b[j++];
		}
		int[] rem = removeDuplicates(c);
		for(int temp:rem) {
			System.out.print(temp+" ");
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
