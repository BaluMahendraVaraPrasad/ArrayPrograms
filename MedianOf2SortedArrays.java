package arrays;

public class MedianOf2SortedArrays {
	 public int findMedianSortedArrays(int[] a, int[] b,int[]merged) 
	    {
	    merged=new int[a.length+b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length) {
	        if (a[i] <= b[j]) {
	            merged[k] = a[i];
	            k++;
	            i++;
	        } else {
	            merged[k] = b[j];
	            k++;
	            j++;
	        }
	    }
	    while (i < a.length) {
	        merged[k] = b[i];
	        k++;
	        i++;
	    }
	    while (j < a.length) {
	        merged[k]= b[j];
	        k++;
	        j++;
	    }
	    int mid = (a.length + b.length) / 2;
	    if ((a.length + b.length) % 2 == 0) {
	        return (merged[mid - 1] + merged[mid]) / 2;
	    } else {
	        return merged[mid];
	    }
	}
	 public static void main(String[] args) {
		 int[]a= {5,8,4,9,6,3};
		 int[]b= {9,5,7,6,4,3,1};
		 int[]c=new int[a.length+b.length];
		 MedianOf2SortedArrays m=new MedianOf2SortedArrays();
		 int d = m.findMedianSortedArrays(a, b,c);
		System.out.println(d);
	}
}
