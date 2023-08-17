import java.util.*;

public class Q21 {
    public static void pattern(int n) {
        int star = 1;
        int space = n*2-3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            space-=2;
            if(i==n-1){
                    star--;
                }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            star++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}