import java.util.*;
public class Anagram3{
public static void anagram(String s1,String s2)
      {
          int a[]=new int[26];
          for(int i=0;i<s1.length();i++)
          {
              a[s1.charAt(i)-97]++;
          }
          for(int i=0;i<s2.length();i++)
          {
              a[s2.charAt(i)-97]--;
          }
          for(int i=0;i<a.length;i++)
          {
              if(a[i]!=0)
                 {
                    System.out.println("not an anagram");
                   System.exit(0);
                 }
          }
          System.out.println("anagram");
      }
      public static void main (String[] args) {
          Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        anagram(s1,s2);
        
      }
      }
      