import java.util.*;

public class Q15 {
    public static void pattern(int n) {
        int space = 0;
        int star = n;
        for (int i = 1; i <= n * 2 - 1; i++) {
            // This loop is for space

            for (int curSpace = 1; curSpace <= space; curSpace++) {
                System.out.print("  ");
            }

            // This loop for start;
            for (int curStar = 1; curStar <= star; curStar++) {
                System.out.print("* ");
            }
            if (i < n) {
                space += 2;
                star--;
            } else {
                space -= 2;
                star++;
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