package arrays;

public class FindAvgHighestLowest {
	public static void main(String[] args)
	{
		int[] a= {1010,20000,1001,987,580};
		System.out.println(sal(a));
	}
	public static String sal(int[] a)
	{
		int sum=0;
		int min=a[0];int max=a[0];
		for(int i=1;i<a.length;i++)
		{
				if(a[i]>max)
					max=a[i];
				if(a[i]<min)
					min=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==max || a[i]==min)continue;
			sum+=a[i];
		}
		int avg=(sum/(a.length-2));
		return avg+" "+min+" "+max;
	}
}
