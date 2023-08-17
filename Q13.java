import java.util.*;

public class Q13 {
    public static void pattern(int num) {
        int star=0;
        for (int i = 1; i <= num*2; i++) {
            for (int k = 0; k <star; k++) {
                System.out.print("* ");
            }
            if(i<=num){
                star++;
            }
            else{
                star--;
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