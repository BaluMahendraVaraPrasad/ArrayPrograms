package arrays;

public class CommonInSortedArrays3 {

	public static void main(String[] args) {
		 int[] arr1 = { 1, 5, 10, 20, 40, 80, 100};
	     int[] arr2 = { 6, 7, 20, 80, 100};
	     commonEle(arr1, arr2);
	}
	public static void commonEle(int[] arr1,int[] arr2) {
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
		     else if (arr1[i] < arr2[j]) {
                i++;
            }else j++;
		}
	}
}
