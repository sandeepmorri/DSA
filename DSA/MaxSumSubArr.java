import java.util.*;
class MaxSumSubArr
{
public static void maxsum(int a[],int n)
 {  
     int max=0;
     for(int i=0;i<n;i++)
     {
         int sum=0;
         for(int j=i;j<n;j++)
         {
            sum+=a[j];
            max=Math.max(max,sum);
         }
     }
     System.out.println(max);
 }

public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);
	int n = s.nextInt ();
	int a[] = new int[n];
	for (int i = 0; i < n; i++)
	  {
		a[i] = s.nextInt ();

	  }
	  maxsum(a,n);
  }
}
