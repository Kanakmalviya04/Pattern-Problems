import java.util.*;

public class Q09 {
    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=(2*i-1); k++){
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