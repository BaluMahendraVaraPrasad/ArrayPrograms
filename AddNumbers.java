package arrays;

import java.util.Arrays;

public class AddNumbers {

	public static void main(String[] args) {
		int[] a= {2,2,0,2,4,0,0};
		modifyAndRearrange(a);
		
		System.out.println(Arrays.toString(a));
		
	}
	public static void modifyAndRearrange(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i < n - 1 && arr[i] == arr[i + 1]) {
                    arr[i] *= 2;
                    arr[i + 1] = 0;
                }
                arr[count] = arr[i];
                if (count != i) {
                    arr[i] = 0;
                }
                count++;
            }
        }
    }
}
