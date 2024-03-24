import java.util.*;
class dutch{
     public static void swap(int arr[],int a,int b)
  {
      int temp=arr[a];
          arr[a]=arr[b];
          arr[b]=temp;
  }
public static void dutch(int a[],int n)
  {
      
      int low=0;
      int mid=0;
      int high=n-1;
      while(mid<=high)
      {
          if(a[mid]==0)
          {
              swap(a,low,mid);
              mid++;
              low++;
          }
          else if(a[mid]==1)
              {
                  mid++;
              }
              else
              {
                  swap(a,mid,high);
                  high--;
             }
      }
       for (int i = 0; i < n; i++)
	  {
	      System.out.print(a[i]+" ");
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
	  dutch(a,n);
  }
}