import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 2;
        boolean t = isPrime(n, i);
        if (t){
            System.out.println("Prime");
        } else{
            System.out.println("Composite");
        }

    }
    public static boolean isPrime(int n, int i){
        if(n % i == 0 && i != n && n > 1){
            return false;
        } else if(i == n){
            return true;
        }
        return isPrime(n, i + 1);
    }
}
