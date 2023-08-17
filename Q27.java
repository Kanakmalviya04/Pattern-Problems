import java.util.*;

public class Q27 {
    public static void pattern(int n) {
        int num = 1;
        int space = n;
        for (int i = 1; i <= n; i++) {
            int a=1;
            for (int j = 1; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print(a + " ");
                a++;
            }
            a--;
            for (int j = 1; j < num; j++) {
                a--;
                System.out.print(a + " ");
            }
            space--;
            num ++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
