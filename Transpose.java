package arrays;

public class Transpose {
   public static void main(String[] args) {
	   int[][]a= {{1,2,3},
			      {4,5,6},
			      {7,8,9}};
	   int[][]b=transpose(a);
	   for(int[]temp:b) {
		   for(int n:temp) {
			   System.out.print(n+" ");
		   }
		   System.out.println();
	   }
	   }
   public static int[][] transpose(int[][]a){
	   int len=a.length;
	   int[][]b=new int[len][len];
	   for(int i=0;i<a.length;i++) {
		   for(int j=0;j<a.length;j++) {
			   b[j][i]=a[i][j];
		   }
	   }
	return b;
   }
	  
}
