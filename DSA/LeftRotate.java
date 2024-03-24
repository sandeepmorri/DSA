import java.util.*;
class LeftRotate
{
  public static void reverse (int a[], int left, int right)
  {
	while (left < right)
	  {
		int temp = a[left];
		  a[left] = a[right];
		  a[right] = temp;
		  left++;
		  right--;
	  }


  }
  public static void leftRotate (int a[], int k)
  {
	int n = a.length;
	reverse (a, 0, k - 1);
	reverse (a, k, n - 1);
	reverse (a, 0, n - 1);
	for (int i = 0; i < n; i++)
	  {
		System.out.print (a[i] + " ");
	  }
  }
  public static void main (String[]args)
  {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt ();
	int a[] = new int[n];
	for (int i = 0; i < n; i++)
	  {
		a[i] = s.nextInt ();

	  }
	int k = s.nextInt ();
	leftRotate (a, k);
  }
}