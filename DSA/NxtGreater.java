import java.util.*;
public class NxtGreater{
public void main(String args[]){
    
    
     int [] a={1,2,3,2,4,3};
     for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
     }
     System.out.println();
     nxtGreaterRight(a);
    }
public static void nxtGreaterRight(int []a){
    Stack<Integer> st=new Stack<>();
    for(int i=a.length-1;i>=0;i--){
        while(!st.isEmpty() && a[i]>=a[st.peek()]){  
            st.pop();
        }if(st.isEmpty())System.out.print("-1"+" ");
        else System.out.print(a[st.peek()]+" ");
        st.push(i);
    }
    System.out.println(st);

}
}
