import java.util.*;

public class NumPermutations {
    public static void main(String args[])
    {
       int a[]={1,2,3};
       boolean b[]=new boolean[a.length];
       ArrayList<Integer> al=new ArrayList<>();
       numpermutations(a,al,b);
    }
     public static void numpermutations(int a[],ArrayList<Integer> al,boolean [] b)
    {
        if(al.size()==a.length)
        {
            System.out.println(al);
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(b[i]==false)
            {
                b[i]=true;
                al.add(a[i]);
                numpermutations(a,al,b);
                al.remove(al.size()-1);
                b[i]=false;
                
            }
        }
    }
}
