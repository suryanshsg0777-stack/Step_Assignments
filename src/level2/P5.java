package level2;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        // Count digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];

        // Store digits
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        // Display reversed
        System.out.println("Reversed number:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}