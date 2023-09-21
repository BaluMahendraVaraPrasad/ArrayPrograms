package arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		int[]a = {5,9,3,5};
		int[]b = {8,6,7,3};
		int[]c = new int[a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
		}
		for(int d:c) {
			System.out.println(d);
		}
	}
}
