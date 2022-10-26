package homework_week_8;
/*Write a method with the name sumDigits that has one int parameter called number.
        If the parameter is >= 10 then the method should process the number and return sum of all digits,
        otherwise return -1 to indicate an invalid value.
        The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
        negative numbers, so also return -1 for negative numbers.
        For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
        Calling the method sumDigits(1) should return -1 as per requirements described above.
        Add some code to the main method to test out the sumDigits method to determine that it is working
        correctly for valid and invalid values passed as arguments.*/

import java.util.Scanner;

public class Programme4_DigitSumChallenge {
    public static void main(String[] args) {
        //scanner declaration to read input from console//
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value :");
        int number = in.nextInt();
        sumDigit(number);
    }

    public static int sumDigit(int number) {
        int sum = 0;
        if (number >= 10) {

            int lastNum;
            while (number != 0) {
                lastNum = number % 10;
                number /= 10;
                sum += lastNum;
            }

        } else {
            System.out.println("Invalid Value");
        }
        return sum;

    }
}
