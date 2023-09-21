package arrays;

public class AnagramInAnArray {

	public static void main(String[] args) {
		String[] a= {"ac","bca"};
		String[] b= {"abc","bca"};
		int[] temp=new int[b.length];
		int count=0;
		for(int i=0;i<b.length;i++) {
			String s=b[i];
			for(int j=0;j<a.length;j++) {
				String s1=a[j];
				if(anagramMethod(s, s1))count++;
			}
			temp[i]=count;
			count=0;
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
	}
	public static boolean anagramMethod(String s1,String s2) {
		while(true) {
		if(s1.length()!=s2.length()) return false;
		if(s1.length()==0 && s2.length()==0)return true;
		char ch=s1.charAt(0);
		s1=s1.replace(ch+"", "");
		s2=s2.replace(ch+"", "");
		
		}
	}
}
