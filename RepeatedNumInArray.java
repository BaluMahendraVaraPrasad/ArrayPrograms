package arrays;

public class RepeatedNumInArray {
    public static void main(String[] args) {
		int[]a= {1,2,3,4,1,2,2,3,4,5,5,6,5};
		
		boolean[] temp=new boolean[a.length];
		for(int i=0;i<a.length-1;i++) {
			if(!temp[i]) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						temp[j]=true;
						System.out.print(a[i]+" ");
						break;
					}
				}
			}
		}
		//repeatedNum(a);
	}
//    public static void repeatedNum(int[] a) {
//      for(int i=0;i<a.length-1;i++) {
//    	  if(a[i]==-1)continue;
//    	  int count=1;
//    	  for(int j=i+1;j<a.length;j++) {
//    		  if(a[i]==a[j]) {
//    			  count++;
//    			  a[j]=-1;
//    		  }
//    		  
//    	  }
//    	  if(count>1)System.out.println(a[i]);
//      }
//    }
}
