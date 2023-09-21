package arrays;

import java.util.Arrays;

public class NthBiggestAndSmallest {

	public static void main(String[] args) {
		int[]a= {5,8,6,7,9,3,4};
		int n=3;
		int[]temp=new int[a.length];
		int[]temp1=new int[a.length];
		int j=0;
		int k=0;
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
			temp[j++]=a[i];
		}
		System.out.println(temp[n-1]+" is nth biggest number");
		for(int i=0;i<a.length;i++) {
			temp1[k++]=a[i];
		}
		System.out.println(temp1[n-1]+" is nth smallest number");
		
	}
}
