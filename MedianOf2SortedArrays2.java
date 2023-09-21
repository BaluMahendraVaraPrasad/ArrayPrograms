package arrays;

import java.util.Arrays;

public class MedianOf2SortedArrays2 {

	public static void main(String[] args) {
		int[]a= {4,8,4,9,6,3};
		int[]b= {9,5,7,6,4,3};
		int[]c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
		Arrays.sort(c);
		int mid=c.length/2;
		if(c.length%2==0) {
			int d= ((c[mid - 1] + c[mid]) / 2);
			System.out.println(d);
		}else 
		System.out.println(c[mid]);
		for(int n:c) {
			System.out.print(n+" ");
		}
	}
}
