import java.util.*;
class SelectionSort 
{
    public static void selection(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        
        }
      
    }

public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
   for(int i=0;i<n;i++)
    { 
        a[i]=s.nextInt();
    }
    selection(a);
    
}
}