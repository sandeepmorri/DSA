import java.util.*;
class Main{
    
public static void anagram(String s1,String s2)
     {
         char a[]=new char[s1.length()];
         char b[]=new char[s2.length()];
         for(int i=0;i<s1.length();i++)
         {
             a[i]=s1.charAt(i);
             b[i]=s2.charAt(i);
         }
         Arrays.sort(a);
         Arrays.sort(b);
         if(Arrays.equals(a,b))
           System.out.println("anagram");
          else
            System.out.println("not anagram");
     }
      public static void main (String[] args) {
        Scanner s=new Scanner(System.in);       
        String s1=s.nextLine();     
        String s2=s.nextLine();
        anagram(s1,s2);
}
}