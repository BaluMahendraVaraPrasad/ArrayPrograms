package arrays;

public class RemoveDupliInTwoArrays {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,8,9};
		int[]b= {1,2,3,4,5,6,7};
		int[]c=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}else {
				c[k++]=b[j++];
			}
		}while(i<a.length) {
			c[k++]=a[i++];
		}while(j<b.length) {
			c[k++]=b[j++];
		}
		for(int l=0;l<c.length;l++) {
            if(l==0 || c[l]!=c[l-1]) {
                System.out.print(c[l]+" ");
            }
        }
	}
}
