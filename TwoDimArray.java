package arrays;

public class TwoDimArray {
    public static void main(String[] args) {
		int[][]a= {{1,2,3},
				   {1,2,3},
				   {1,2,3}};
		int sum=0;
		for(int[]tenp:a) {
			for(int n:tenp) {
				sum+=n;
				
				System.out.print(n+" ");
			}
			System.out.println();
 		}
		System.out.println(sum);
		
	}
}
