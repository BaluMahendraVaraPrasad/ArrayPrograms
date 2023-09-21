package arrays;

import java.util.Scanner;

public class CreatingArray {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter size");
	int size=scn.nextInt();
	int[]a=new int[size];
	System.out.println("Enter Elements");
	for(int i=0;i<a.length;i++) {
		a[i]=scn.nextInt();
	}
	System.out.println("The array elements are:");
	//int sum=0;
	for(int i=0;i<a.length;i++) {
		//sum+=a[i];
		System.out.println(a[i]);
	}
	//System.out.println(sum);
}
}
