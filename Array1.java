package com.Array.pack;

import java.util.Scanner;

public class Array1 {

	 public static int solve (int r, int unit, int arr[], int n)
	  {
	    if (arr == null)
	      return -1;
	    int res = r * unit;
	    int sum = 0;
	    int count = 0;
	    for (int i = 0; i < n; i++)
	      {
		sum = sum + arr[i];
		count++;
		if (sum >= res)
		  break;
	      }
	    if (sum < res)
	        return 0;
	    return count;
	  }
	  public static void main (String[]args)
	  {
	    int r = 7;
	    int unit = 2;
	    int arr[] = {2,5,8,9,4,6,3,4};
	   System.out.println(solve(r, unit, arr, arr.length/2));
	  }
	
}
