package com.Array.pack;

public class SmallestNum {
   public static void main(String[] args) {
	int[]a= {9,4,6,2,5,7};
	int small=a[0];
	for(int i=1;i<a.length;i++) {
		if(small>a[i])small=a[i];
	}
	System.out.println(small);
}
}
