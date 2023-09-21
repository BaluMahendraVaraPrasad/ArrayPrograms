package arrays;

public class Arrays {

	private static Object[]a= {12,8,7,5,0};
	public static void add(int index,Object ele) {
		if(a[a.length-1]!=null)increase();
		for(int i=a.length-2;i>=index;i--) {
		a[i+1]=a[i];
		}
		a[index]=ele;
	}
	public static void increase() {
		Object[]temp=new Object[a.length+1];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public static void display() {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		    add(2, 5);
			display();
			
	}
}
