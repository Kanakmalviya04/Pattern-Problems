import java.util.*;

public class Q10 {
    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j <= num * 2 - i; j++) {
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
