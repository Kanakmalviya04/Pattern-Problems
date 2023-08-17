import java.util.*;

public class Q22 {
    public static void pattern(int n) {
        int star = n;
        int space = 0;
        for (int j = 0; j < n*2-1; j++) {
                System.out.print("* ");
            }
        System.out.println();
        for (int i = 1; i < n; i++) {
            star--;
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            space+=2;
            for (int j = 0; j < space-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
