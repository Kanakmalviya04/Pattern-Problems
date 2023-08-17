import java.util.*;

public class Q29 {
    public static void pattern(int n) {
        int num = 1;
        int space = n;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num-1) {
                    System.out.print(a + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            space--;
            num+=2;
            System.out.println();
            a++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
