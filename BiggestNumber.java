package arrays;

public class BiggestNumber {
   public static void main(String[] args) {
	int[]a= {45,88,45,93,45,85,45};
	int b1=a[0];
	int b2=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]==b1)continue;
		else if(a[i]>b1) {
			b2=b1;
			b1=a[i];
		}
		else if(a[i]>b2 || b1==b2) {
			b2=a[i];
		}
	}
	System.out.println(b1+" is 1st biggest number");
	System.out.println(b2+" is 2nd biggest number");
}
}