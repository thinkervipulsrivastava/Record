import java.util.Scanner;

public class dayThreeSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int arr [] = new int[a];
        for (int i = 0; i < a; i ++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < a; i ++) {
            for (int j = i; j < a; j ++) {
                for (int k = i; k <j; k ++) {
                    System.out.print(k);
                }
            }
        }
    }
}

