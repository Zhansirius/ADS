import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        System.out.println(GCD(a, b));
    }
    public static int GCD(int a, int b){
        if (b == 0){
            return a;
        }
        return GCD(b, a % b);
    }
}
