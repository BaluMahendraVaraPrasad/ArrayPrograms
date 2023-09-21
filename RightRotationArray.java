package arrays;

public class RightRotationArray {

	public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int k=2;
        if(k<a.length) {
        int[] rotatedArray = rightRotateArray(a, k);
        
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
        }else System.out.println("not valid");
    }
    
    public static int[] rightRotateArray(int[] a, int k) {
        int[] b = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            int index = (i + k) % a.length;
            b[index] = a[i];
        }
        
        return b;
    }
}
