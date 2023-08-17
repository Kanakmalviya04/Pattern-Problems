import java.util.*;

public class Q33 {
    public static void pattern(int n) {
        int a = n;
        int space = n;
        int num = 1;
        for(int i=1; i<=n; i++){
            a=n-i+1;
            for(int j=1; j<space; j++){
                System.out.print("  ");
            }
            space--;
            for(int j=1; j<num; j++){
                System.out.print(a+" ");
                a++;
            }
            
            System.out.print("0 ");
            for(int j=1; j<num; j++){
                a--;
                System.out.print(a+" ");
            }
            num++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
