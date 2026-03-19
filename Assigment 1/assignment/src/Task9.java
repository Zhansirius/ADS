import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(sCount(s));
    }
    public static int sCount(String s){
       if (s.isEmpty()){
           return 0;
       }
       return 1 + sCount(s.substring(1));
    }
}
