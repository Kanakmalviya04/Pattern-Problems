import java.util.*;

public class Q07 {
    public static void pattern(int num) {
        for (int i = 0; i < num; i++) {
            if(i==0 || i==num-1){
                for(int j=0; j<num; j++){
                    System.out.print("* ");
                }
            }
            else{
                for (int j = 0; j < num; j++) {
                if(j==0 || j==num-1){
                   System.out.print("* "); 
                }
                else{
                    System.out.print("  ");
                }
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