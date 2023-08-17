import java.util.*;

public class Q17 {
    public static void pattern(int n) {
        int star = n / 2;
        int space = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if (i <= n / 2) {
                space += 2;
                star--;
            } else {
                star++;
                space -= 2;
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
