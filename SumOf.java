package arrays;

public class SumOf {

	public static void main(String[] args) {
		int n=4;
		int m=20;
		int div=0;
		int nm=0;
		for(int i=1;i<=m;i++) {
			if(i%n==0)div+=i;
			else nm+=i;
		}
		int result=nm-div;
		System.out.println(result);
	}
}
