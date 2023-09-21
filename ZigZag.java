package arrays;

import java.util.Arrays;

public class ZigZag {
	public static void main (String[] args) throws java.lang.Exception {
        int[]a= {1,2,3,4,5,6,7};
        int len=a.length;
            findZigZagSequence(a, len);
        }
   
    public static void findZigZagSequence(int [] a, int n){
        //Arrays.sort(a);
        int mid = n /2;
        int temp = a[mid];
        a[mid] = a[n-1];
        a[n-1] = temp;
    
        int st = mid+1;
        int ed = n-2;
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
        for(int i = 0; i < n; i++){
//            if(i > 0) System.out.print(" ");
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
