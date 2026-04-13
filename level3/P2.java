package level3;
import java.util.Scanner;

public class P2 {

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

    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits)
            sum += Math.pow(d, power);

        return sum == n;
    }

    public static void largestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }

        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }

    public static void smallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }

        System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digit Count: " + digits.length);
        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(n, digits));

        largestTwo(digits);
        smallestTwo(digits);
    }
}