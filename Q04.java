import java.util.*;

public class Q04 {
    public static void pattern(int num) {
        for (int i = num; i >= 0; i--) {
            for (int j = 0; j < num; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
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