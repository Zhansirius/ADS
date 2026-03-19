import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(pow(a, n));
    }
    public static int pow(int a, int n){
        if(n == 0){
            return 1;
        } else if(a == 0){
            return 0;
        }
        return a * pow(a, n - 1);
    }
}
