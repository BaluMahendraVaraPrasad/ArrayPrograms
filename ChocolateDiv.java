package arrays;

public class ChocolateDiv {
	    public static int birthdayChocolate(int[] chocolate, int birthDay, int birthMonth) {
	        int count = 0;
	        
	        // Iterate over each possible segment
	        for (int i = 0; i <= chocolate.length - birthMonth; i++) {
	            int sum = 0;
	            
	            // Calculate the sum of the segment
	            for (int j = i; j < i + birthMonth; j++) {
	                sum += chocolate[j];
	            }
	            
	            // Check if the sum matches the birth day
	            if (sum == birthDay) {
	                count++;
	            }
	        }
	        
	        return count;
	    }

	    public static void main(String[] args) {
	        int[] chocolate = {1, 2, 1, 3, 2};
	        int birthDay = 3;
	        int birthMonth = 2;
	        
	        int ways = birthdayChocolate(chocolate, birthDay, birthMonth);
	        System.out.println("Number of ways to divide the chocolate: " + ways);
	    }
	}
