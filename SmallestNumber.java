package arrays;

public class SmallestNumber {
   public static void main(String[] args) {
	int[]a= {45,84,94,75,55,42,64};
	int s1=a[0];
	int s2=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]==s1)continue;
		else if(a[i]<s1) {
			s2=s1;
			s1=a[i];
		}
		else if(a[i]<s2 || s1==s2) {
			s2=a[i];
		}
	}
	System.out.println(s1);
	System.out.println(s2);
}
}
