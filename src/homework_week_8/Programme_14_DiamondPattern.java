package homework_week_8;

/*Write a program in Java to display the pattern like a diamond.
        While loop
        *
        ***
        *****
        *******
        *********
        ***********
        *************
        ***********
        *********
        *******
        *****
        ***
        *  */

import java.util.Scanner;

public class Programme_14_DiamondPattern {

    public static void main(String[] args) {
        dimondMethod();   //call method to main method//
    }

    public static void dimondMethod() {
        //scanner declaration to read input from console//
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for diamond pattern :");
         int num = scanner.nextInt();


        for (i = 0; i <= num; i++) {
            for (j = 1; j <= num-i ; j++)
            System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
            System.out.print("*");
            System.out.print("\n");

        }
        for (i = num - 1; i >= 1; i--) {
            for (j = 1; j <= num - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
