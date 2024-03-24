import java.util.*;
class MajoritElement 
{
    public static void major(int a[],int n)
    {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int i:map.keySet())
        {
            if(map.get(i) > a.length/2)
            System.out.println(i);
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
        major(a,n);
        
        
    }
}