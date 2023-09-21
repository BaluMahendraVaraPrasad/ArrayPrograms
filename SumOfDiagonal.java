package arrays;

public class SumOfDiagonal {
   public static void main(String[] args) {
	   int[][]a= {{1,2,3},
			      {1,2,3},
			      {1,2,3}};
	   int sum=0;
	   int len=a.length;
	   for(int i=0;i<a.length;i++) {
		   sum+=a[i][i];
		   if(len%2!=0 && i==len/2)continue;
		   sum+=a[i][len-1-i];
	   }
	   System.out.println(sum);
}
}
