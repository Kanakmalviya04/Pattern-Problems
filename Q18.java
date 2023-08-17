import java.util.*;

public class Q18 {
    public static void pattern(int n) {
        int star = 1;
        int space = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if(i<n/2){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
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