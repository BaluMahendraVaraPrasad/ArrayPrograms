package arrays;

public class TwistedPrimeNumber {

	public static void main(String[] args) {
		int i=3646;
		int reverse = reverse(i);	
		if(prime(i)) {
			if(prime(reverse)) {
				System.out.println("twisted ");
			}
		}else System.out.println("not twisted");
	}
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	public static boolean prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)count++;
		}
		if(count!=2)return false;
		return true;
	}
}
