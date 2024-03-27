public class StrPermutations {
    public static void main(String[] args) {
        strper("abc","");
    }
    public static void strper(String s,String p)
    {
         if(s.length()==0)
         {
             System.out.print(p+" ");
             return;
         }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String newStr=s.substring(0,i)+s.substring(i+1);
            strper(newStr,p+c);
        }
    }
}
