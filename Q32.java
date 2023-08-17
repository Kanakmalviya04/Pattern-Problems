import java.util.*;

public class Q32 {
    public static void pattern(int n) {
        int num=0;
        int star=1;
        for (int i = 0; i < n*2-1; i++) {
            num++;
            for (int j = 0; j < star; j++) {
                if(j%2==0){
                    System.out.print(num+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            if(i<n-1){
                star+=2;
            }
            else{
                star-=2;
                num-=2;
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
