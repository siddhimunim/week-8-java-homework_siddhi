package homework_week_8;

import java.util.Scanner;

/*Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@*/
public class programme_8_Triangle {
    public static void pattern() {
        //scanner declaration to read input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no for row:");
        int rate = scanner.nextInt();
        for (int i = 0; i <= rate; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@" + "");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        pattern(); // call method//
    }
}
