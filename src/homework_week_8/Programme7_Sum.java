package homework_week_8;

import java.util.Scanner;

/*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method needs to find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needs to return -1 to indicate an invalid value.*/
public class Programme7_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value:");
        int number = scanner.nextInt();
        sumFirstAndLastDigit(number);
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastNum = number % 10;
        if (number >= 0) {
            while (number >= 10) {
                number /= 10;
            }
        } else {
            System.out.println(-1 + " " + "Negative value");
            return -1;

        }
        System.out.println("Sum of two digit " + (number + lastNum));
        return (number + lastNum);
    }
}

