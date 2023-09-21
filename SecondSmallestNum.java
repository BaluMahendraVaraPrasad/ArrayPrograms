package com.Array.pack;

public class SecondSmallestNum{
	static int secondSmallest(int[]a) {
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++) {
			if(s1==a[i])continue;
			else if(s1>a[i]) {
				s2=s1;
			    s1=a[i];
			    
			}
			else if(s2>a[i]|| s1==s2) {
				s2=a[i];
			}
		}
		return s2;
	}
	public static void main(String[] args) {
		int[]a= {5,8,9,3,15,45};
		System.out.println(secondSmallest(a));
	}
}