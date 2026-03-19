import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibbonachi(n));
    }
    public static int fibbonachi(int n){
        int i1= 1;
        if(n == i1){
            return 1;
        } else if(n == 2){
            return 1;
        }
        return fibbonachi(n - 2) + fibbonachi(n - 1);
    }
}
