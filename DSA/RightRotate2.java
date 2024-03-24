import java.util.*;
class RightRotate2
{
  public static void reverse (int a[], int left, int right)
  {
	while (left < right)
	  {5
		int temp = a[left];
		  a[left] = a[right];
		  a[right] = temp;
		  left++;
		  right--;
	  }


  }
  public static void rightRotate (int a[], int k)
  {
	int n = a.length;
	reverse (a, 0, n - k - 1);
	reverse (a, n - k, n - 1);
	reverse (a, 0, n - 1);
	for (int i = 0; i < n; i++)
	  {
		System.out.print (a[i] + " ");
	  }
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
	int k = s.nextInt ();
	rightRotate (a, k);
  }
}