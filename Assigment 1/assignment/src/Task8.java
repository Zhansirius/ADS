import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        if (isInt(s)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isInt(String s){
        if (s.isEmpty()){
            return true;
        }
        if(Character.isDigit(s.charAt(0))){
            return isInt(s.substring(1));
        } else {
            return false;
        }
    }
}
