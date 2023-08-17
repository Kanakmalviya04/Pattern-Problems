import java.util.*;

public class Q11 {
    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <=num-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <2*i; j++) {
                if(j%2==1){
                    System.out.print("* ");
                }
                else{
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