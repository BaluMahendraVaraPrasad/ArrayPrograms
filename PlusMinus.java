package arrays;

import java.util.List;

public class PlusMinus {
	public static void plusMinus(List<Integer> arr) 
    {
    int p=0;
    int n=0;
    int z=0;
    int m=arr.size();
    // Write your code here
    for(int s:arr)
    {
       if( s>0){
           p++;
       }
       else if(s<0)
       {
           n++;
       }
       else
       z++;
    }
    System.out.println("p "+(double)p/m);
    System.out.println("n "+(double)n/m);
    System.out.println("z "+(double)z/m);
}
	public static void main(String[] args) {
		 List<Integer> list = List.of(1,6,7,0,-5,-9,-8);
		 plusMinus(list);
		 
	    }
	}