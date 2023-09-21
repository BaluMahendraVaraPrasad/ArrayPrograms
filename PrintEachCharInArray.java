package arrays;

public class PrintEachCharInArray {
  public static void main(String[] args) {
	  String []s= {"hiy","hkgj","kj"};
	for(int i=0;i<s.length;i++) {
		for(int j=0;j<s[i].length();j++) {
			char ch=s[i].charAt(j);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println(ch);
			}
		}
	}
}
}
