public class Fibo {
    public static void main(String[] args) {
        fibo(0,1,10);
    }
    public static void fibo(int start, int end, int n) {
        if (n == 0)
            return;
        int c = start + end;
        System.out.print(c + " ");
        fibo(end, c, n - 1);
    }

}
