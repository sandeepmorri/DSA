import java.util.*;
public class PreToPos
{
    public static void main(String Args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String st=preToPos(s);
System.out.println(st);
    }
public static String preToPos(String s){
    Stack <String> st=new Stack<>();
    for(int i=s.length()-1;i>=0;i--){
        char c=s.charAt(i);
        if((c>='a' && c<='z') || (c>='A' && c<='Z')) st.push(c+"");
        else{
            String top1=st.pop();
            String top2=st.pop();
            st.push(top1+top2+c);
        }
    }
    return st.pop();
  }}