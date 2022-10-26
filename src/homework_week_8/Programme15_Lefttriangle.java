package homework_week_8;

import java.util.Scanner;

/*Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *   */
public class Programme15_Lefttriangle {
    public static void main(String[] args) {
        triangle();   // call main method//
    }

    public static void triangle() {
        //scanner declaration to read input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Row Number For Display :");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            scanner.close();

    }
}
