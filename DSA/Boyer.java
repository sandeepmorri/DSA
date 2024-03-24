import java.util.*;
class Boyer 
{
    public static void voting(int a[],int n)
    {
        
        int votes=0;
        int maj=-1;
        for(int i=0;i<n;i++)
        {
            if(votes==0)
            {
                maj=a[i];
                votes=1;
            }
            else
            {
                if(a[i]==maj)
                votes++;
                else
                votes--;
                
            }
            
            }
            int c=0;
            for(int i=0;i<n;i++)
        {
            if(a[i]==maj)
            {
                c++;
            }
            
            
        }
        if(c>a.length/2)
        System.out.println(maj);
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
        voting(a,n);
}
}