import java.util.*;
public class Snake{


public static void main(String[] args) {
    int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    snake(a);}
public static void snake(int a[][]) {
    for (int i = 0; i < a.length; i++) {
        if (i % 2 == 0) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + " ");
            }
        } else {
            for (int j = a.length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
        }

    }
}
}
