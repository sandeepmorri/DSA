public class Factorial{
public static void main(String args[]){
int f=fact(6,1);
System.out.println(f);
}

public static int fact(int n, int fact) {
    if (n == 0) {
        return fact;
    }
    
    return fact(n - 1, fact * n);
}
}