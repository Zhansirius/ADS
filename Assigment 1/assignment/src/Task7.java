import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse_nums(n, sc);
    }
    public static void reverse_nums(int n, Scanner sc) {
        if (n == 0){
            return;
        }
        int x = sc.nextInt();
        reverse_nums(n - 1, sc);
        System.out.print(x + " ");
    }
}