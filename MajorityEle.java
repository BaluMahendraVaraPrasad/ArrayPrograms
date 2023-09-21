package arrays;

public class MajorityEle {

	public static void main(String[] args) {
		int[] arr = {2, 3, 3, 2, 3, 3, 5, 3, 2};
	    int majorityElement = findMajorityElement(arr);

	    if (majorityElement != -1) {
	        System.out.println("Majority Element: " + majorityElement);
	    } else {
	        System.out.println("No majority element found");
	    }
	}
	public static int findMajorityElement(int[] arr) {
	    int count = 0;
	    int ele = 0;

	    for (int num : arr) {
	        if (count == 0) {
	            ele = num;
	            count = 1;
	        } else if (ele == num) {
	            count++;
	        } else {
	            count--;
	        }
	    }
	    count = 0;
	    for (int num : arr) {
	        if (num == ele) {
	            count++;
	        }
	    }

	    if (count > arr.length / 2) {
	        return ele;
	    }

	    return -1;
	}
}