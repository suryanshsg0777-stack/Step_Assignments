package level3;
import java.util.Scanner;

public class P3 {

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] getDigits(int n) {
        int size = countDigits(n);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int sum(int[] digits) {
        int s = 0;
        for (int d : digits)
            s += d;
        return s;
    }

    public static double sumOfSquares(int[] digits) {
        double s = 0;
        for (int d : digits)
            s += Math.pow(d, 2);
        return s;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sum(digits) == 0;
    }

    public static void frequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits)
            freq[d][1]++;

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Sum of digits: " + sum(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(n, digits));

        frequency(digits);
    }
}