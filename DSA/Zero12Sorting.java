import java.util.*;
class Zero12Sorting{
 public static void sort(int a[],int n)
  {   
      int z=0,o=0,t=0;
      for(int i=0;i<n;i++)
      {
          if(a[i]==0) 
              z++;
        else if(a[i]==1)
              o++;
            else
               t++;
      }
      int k=0;
      while(z!=0)
      {
          a[k]=0;
          z--;
          k++;
      }
       while(o!=0)
      {
          a[k]=1;
          k++;
          o--;
      }
       while(t!=0)
      {
          a[k]=2;
          k++;
          t--;
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
	  sort(a,n);
  }
}