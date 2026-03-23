package level1;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] result = new int[4]; // for 6 to 9

        int index = 0;

        for (int i = 6; i <= 9; i++) {
            result[index] = number * i;
            index++;
        }

        // Display
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index]);
            index++;
        }
    }
}