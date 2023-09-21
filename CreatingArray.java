package com.Array.pack;

import java.util.Scanner;

public class CreatingArray {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter size of an array");
	int size=scn.nextInt();
	int[]arr=new int[size];
	System.out.println("Enter the array elements:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
	}
	System.out.println("Entered elements are:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	scn.close();
}
}
