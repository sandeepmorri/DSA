import java.util.*;
class Kadane{
public static void kadane(int a[],int n)
 {
     int cur=0;
     int max= Integer.MIN_VALUE;
     for(int i=0;i<n;i++)
     {
     cur+=a[i];
     if(cur<0)
        cur=0;
      max=Math.max(cur,max);
     }
     System.out.println(max);
 }
  public static void main (String args[])
  {
	Scanner s= new Scanner (System.in);
	int n= s.nextInt ();
	int a[] = new int[n];
	for (int i = 0; i < n; i++)
	  {
		a[i] = s.nextInt ();
	  }
	  kadane(a,n);
  }
}