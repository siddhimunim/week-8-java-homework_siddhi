package homework_week_8;

import java.util.Scanner;

/* Write a program to input any number and check if it Armstrong number or not
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153*/
public class Programme_10_ArmstrongNo {
    public static void main(String[] args) {
        armMethod();               //call method to main method//
    }

    public static void armMethod() {
        //scanner declaration to read input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = scanner.nextInt();
        int reminder, input = 0;
        int x = n;
        while (n > 0) {
            reminder = n % 10;        //reminder of n value//
            input = reminder * reminder * reminder + input; //cube of reminder and add with input var which declare 0//
            n = n / 10;               //devide same n no to 10//
        }
        if (x == input) {
            System.out.println("It is Armstrong No");
        } else
            System.out.println("It is  NOT Armstrong No");


    }
}
