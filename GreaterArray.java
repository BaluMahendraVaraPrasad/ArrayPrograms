package arrays;

public class GreaterArray {
    public static void main(String[] args) {
		int[]a= {4,7,3,4,8,1};
		int[] greater = nextGreaterEle(a);
		for(int n:greater) {
			System.out.print(n+" ");
		}
		
	}
    public static int[] nextGreaterEle(int[] a) {
    	
    	int[] result=new int[a.length];
    	
    	for(int i=0;i<a.length;i++) {
    		int greater=-1;
    		for(int j=i+1;j<a.length;j++) {
    			if(a[i]<a[j]) {
    				greater=a[j];
    			    break;
    			}
    		}
    		result[i]=greater;
    	}
		return result;
    }
}
