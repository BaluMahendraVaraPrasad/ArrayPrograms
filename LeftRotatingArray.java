package arrays;

public class LeftRotatingArray {

	public static void main(String[] args) {
	    int[] a = {1,2,3,4,5,6};
	    int k=2;

	    rotatedArray(a,k);
	}
	public static void rotatedArray(int[]a,int k) {
	    
		if(k<=a.length) {
	    for(int i=k;i<a.length;i++) {
	        System.out.print(a[i] + " ");
	    }

	    for (int i=0;i<k;i++) {
	        System.out.print(a[i] + " ");
	    }

	    System.out.println();
		}
		else System.out.println("not valid");
	}
}
