import java.util.*;

public class Q16 {
    public static void pattern(int n) {
        int star = n;
        int space = n;
        for (int i = 0; i < n*2-1; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if(i>=n-1){
                star++;
                space++;
            }
            else{
                star--;
                space--;
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