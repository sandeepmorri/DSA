
import java.util.*;
public class PosToIn
{
    public static void main(String Args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String st=posToin(s);
System.out.println(st);
    }
public static String posToin(String s){
    Stack <String> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if((c>='a' && c<='z') || (c>='A' && c<='Z')) st.push(c+"");
        else{
            String top1=st.pop();
            String top2=st.pop();
            st.push("("+top2+c+top1+")");
        }
    }
    return st.pop();
  }
}