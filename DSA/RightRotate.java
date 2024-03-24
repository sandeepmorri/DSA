import java.util.*;
public class RightRotate
{
 
  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);
	int n = s.nextInt ();
	int a[] = new int[n];
	for (int i = 0; i < n; i++)
	  {
		a[i] = s.nextInt ();

	  }
	int k = s.nextInt ();
    for (int j = 0; j < k; j++)
	  {
		int temp = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--)
		  {
			a[i + 1] = a[i];
		  }
		a[0] = temp;
      }
	
	for (int i = 0; i < n; i++)
	  {
		System.out.print (a[i] + " ");

	  }
  
}}