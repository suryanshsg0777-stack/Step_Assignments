package level3;
import java.util.Scanner;

public class P1 {
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

        // Store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        int[] frequency = new int[10]; // digits 0–9

        // Calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
