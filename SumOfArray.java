package com.Array.pack;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scn.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
