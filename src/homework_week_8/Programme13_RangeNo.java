package homework_week_8;
/*Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
        within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
        otherwise, the method should return false.*/


import java.util.Scanner;

public class Programme13_RangeNo {
    public static void main(String[] args) {
        //scanner declaration to read input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number :");
        int num2 = scanner.nextInt();
        System.out.println( hasSharedDigit(num1,num2));    //calling method to main method//
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1<10||num1>99) || (num2<10 || num2>99)){
            return false;
        }
        else if ((num1/10==num2/10 )|| (num1%10 == num2%10)||(num1/10 == num2%10)||(num1%10 ==num2/10)){
            return true;
        }
         return false;
    }
}
