import java.util.*;
class Uniq
{
  public static void unique (int a[], int n)
  {
	int xor = 0;
	  Arrays.sort (a);
	for (int i = 0; i < n; i++)
	  {
		xor = xor ^ a[i];

	  }
	System.out.println (xor);
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

	unique (a, n);
  }
}