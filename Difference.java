package arrays;

class Difference
{
  public static int findCount (int arr[], int length, int num, int diff)
  {
    int count = 0;
    for (int i = 0; i < length; i++)
      {
	if (Math.abs (num - arr[i]) <= diff)
	  count++;
      }
    return count > 0 ? count : -1;
  }
  public static void main (String[]args)
  {
    int arr[] = {4,6,9,7,45,3};
    int num = 9;
    int diff = 3;

    System.out.println (findCount (arr, arr.length, num, diff));
  }
}
