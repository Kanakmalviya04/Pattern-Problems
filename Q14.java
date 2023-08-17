import java.util.*;

public class Q14 {
    public static void pattern(int num) {
        int star=0;
        int space=num;
        for (int i = 1; i <= num*2; i++) {
            for (int k = 0; k <space; k++) {
                System.out.print("  ");
            }
            for (int k = 0; k <star; k++) {
                System.out.print("* ");
            }
            if(i<=num){
                star++;
                space--;
            }
            else{
                star--;
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
