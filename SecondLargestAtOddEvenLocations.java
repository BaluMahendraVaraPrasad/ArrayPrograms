package arrays;

public class SecondLargestAtOddEvenLocations {

    public static void main(String[] args) {
        int[] arr = { 3,2, 1, 7, 5, 4 };
        int result = findAndAddSecondLargestAtOddEvenLocations(arr);
        System.out.println(result);
    }

    public static int findAndAddSecondLargestAtOddEvenLocations(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        int oddSecondLargest = arr[1];
        int evenSecondLargest = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

            if (i % 2 == 0 && arr[i] > evenSecondLargest) {
                evenSecondLargest = arr[i];
            } else if (i % 2 != 0 && arr[i] < oddSecondLargest) {
                oddSecondLargest = arr[i];
            }
        }

        int sum = 0;
        
        if (evenSecondLargest != largest) {
            sum += evenSecondLargest;
        }
        if (oddSecondLargest != largest) {
            sum += oddSecondLargest;
        }

        return sum;
    }
}
