package arrays;

public class Sorting2StringArrays {

	public static void main(String[] args) {
		String[] a= {"Balu","5","Dinu"};
		String[] a1= {"50","90","60"};
		int length=a.length+a1.length;
		String[] res=new String[length];
		for(int i=0;i<a.length;i++) {
			res[i]=a[i];
		}
		for(int i=0;i<a1.length;i++) {
			res[a.length+i]=a1[i];
		}
		sort(res);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static String[] sort(String[] s) {
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length-1-i;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		return s;
	}
	}






