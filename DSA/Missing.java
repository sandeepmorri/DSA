import java.util.*;
class Missing{
    public static void missing(int a[],int n)
    {
        int xor=a.length;
        for(int i=0;i<n;i++)
        {
            xor=xor^a[i]^i;
            
        }
        System.out.println(xor);
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
        missing(a,n);
    }
}