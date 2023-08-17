import java.util.*;

public class Q06 {
    public static void pattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
            for (int k = i; k < num; k++) {
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