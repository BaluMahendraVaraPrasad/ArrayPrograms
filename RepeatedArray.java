package arrays;

public class RepeatedArray {
   public static void main(String[] args) {
	int[]a= {1,2,3,4};
	int[]b=new int[a.length*2];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
		b[i+a.length]=a[i];
	}
	for(int s:b) {
		System.out.print(s);
	}
//	int []c=new int[a.length];
//	for(int i=0;i<a.length;i++) {
//		c[i]=a[i];
//		//c[i+a.length]=a[i];
//	}
//	for(int s:c) {
//		System.out.print(s);
//	}
}
}
