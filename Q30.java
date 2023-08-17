import java.util.*;

public class Q30 {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            int a = n;
            for (int j = 0; j < n; j++) {
                System.out.print(a + " ");
                a--;
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
