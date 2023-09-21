package arrays;

public class LinearSearch {
   public static void main(String[] args) {
	int[]a= {5,8,6,4,3};
	System.out.println(search(a, 5));
}
   public static int search(int[]a,int ele) {
	   for(int i=0;i<a.length;i++) {
		   if(a[i]==ele)return i;
	   }
	   return -1;
   }
}
