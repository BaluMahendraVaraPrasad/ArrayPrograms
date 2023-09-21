package arrays;

class Binary
{
  public static int operationsBinaryString (String str)
  {
    if (str == null)
      return -1;
    int res = str.charAt (0) - '0';
    for (int i = 1; i < str.length ();)
      {
	char prev = str.charAt (i);
	  i++;
	if (prev == 'A')
	  res = res & (str.charAt (i) - '0');
	else if (prev == 'B')
	  res = res | (str.charAt (i) - '0');
	else
	    res = res ^ (str.charAt (i) - '0');
	  i++;
      }
    return res;
  }
  public static void main (String[]args)
  {
    String str = "1C0C1C1A0B1C1";
    System.out.println (operationsBinaryString (str));
  }
}
