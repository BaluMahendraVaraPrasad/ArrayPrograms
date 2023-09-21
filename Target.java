package arrays;

import java.util.Arrays;

public class Target {
	public static void main(String[] args)
	{
     	int[] a= {2,5,7,2,8,3,5,6};
		int target=9;
		System.out.println(Arrays.toString(sum(a,target)));
	}	
	public static int[] sum(int[] a,int target)
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]+a[i+1]==target)
				return new int[] {i,i+1};
		}
		return a;
	
}
}
