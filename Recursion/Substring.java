public class Substring {
    public static void main(String[] args) {
        substr("abc",0,"");
    }
    public static void substr(String s,int i,String newstr)
    {
       
            if(s.length()==i)
            {
                System.out.println(newstr);
                return;
            }
            substr(s,i+1,newstr);
            substr(s,i+1,newstr+=s.charAt(i));
            
    }
}
