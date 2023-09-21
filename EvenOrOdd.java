package arrays;

public class EvenOrOdd {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int arr:a) {
			sum+=arr;
		}
		if(sum%2==0)
		System.out.println(sum+" is even");
		else System.out.println(sum+" is odd");
	}
}
