import java.util.*;
class Major3
{
public static void main(String[] args)
    {
        //if majority element must exist
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[a.length/2]);
    }
}