package com.Array.pack;

public class TwoDimArray1 {
    public static void main(String[] args) {
		int[][]a=new int[3][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[1];
		for(int[]temp:a) {
			for(int n:temp) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
}
