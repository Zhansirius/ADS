import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int[] nums = new int[n];
        fillArray(nums, i, sc);
        int s = sum(nums, n);
        double avg = (double) s / n;
        System.out.println(avg);
    }
    public static void fillArray(int[] nums, int i, Scanner sc){
        if (i == nums.length) {
            return;
        }
        nums[i] = sc.nextInt();
        fillArray(nums, i + 1, sc);
    }
    public static int sum(int[] nums, int n){
        if (n <= 0){
            return 0;
        }
        return nums[n - 1] + sum(nums, n - 1);
    }
}
