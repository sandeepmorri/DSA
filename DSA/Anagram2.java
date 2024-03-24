import java.util.*;
public class Anagram2{
public static void anagram(String s1,String s2)
      {
         HashMap <Character,Integer> map=new HashMap<>();
          for(int i=0;i<s1.length();i++)
          {
              map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
          }
          for(int i=0;i<s2.length();i++)
          {
              map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
          }
          for(char i:map.keySet())
          {
              if(map.get(i)!=0)
                 System.out.println("not a anagram");
                  
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