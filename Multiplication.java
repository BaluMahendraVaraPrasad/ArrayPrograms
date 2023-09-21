package arrays;

public class Multiplication {
   public static void main(String[] args) {
	   int[][]a= {{1,2,3},
			      {1,2,3},
			      {1,2,3}};
	   int[][]b= {{1,2,3},
			      {1,2,3},
			      {1,2,3}};
	   int[][]c= new int[a.length][a.length];
	   multiply(a, b, c);
	   for(int[]temp:c) {
		   for(int n:temp) {
			   System.out.print(n+" ");
		   }
		   System.out.println();
	   }
	   
}
   public static void multiply(int[][]a,int [][]b,int[][]c){
	   int len=a.length;
	   for(int i=0;i<len;i++) {
		   for(int j=0;j<len;j++) {
			   int sum=0;
			   for(int k=0;k<len;k++) {
				   sum+=a[i][k]*b[k][j];
			   }
			   c[i][j]=sum;
		   }
	   }
   }
}
