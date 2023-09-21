package com.Array.pack;

public class SumOfAntiDiagonal {
   public static void main(String[] args) {
	   int[][]a= {{1,2,3},
	  			  {4,5,6},
	  			  {7,8,9}};
	   int sum=0;
	   int len=a.length;
	   for(int i=0;i<a.length;i++) {
		   sum+=a[i][i];
		   if(len%2!=0 && i==len/2)continue;
		   sum+=a[i][len-1-i];
	   }
	   System.out.println("Sum="+sum);
}
}
