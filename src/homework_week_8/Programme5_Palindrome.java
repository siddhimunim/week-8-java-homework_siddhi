package homework_week_8;

import java.util.Scanner;

/*Write a method called isPalindrome with one int parameter called number.
        The method needs to return a boolean.
        It should return true if the number is a palindrome number otherwise it should return false.
        Check the tips below for more info about palindromes.
        Example Input/Output
        isPalindrome(-1221); → should return true
        isPalindrome(707); → should return true
        isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212*/
public class Programme5_Palindrome {
    public static void main(String[] args) {
        //scanner declaration to read input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value ");
        int number = scanner.nextInt();
        ispaalindrome(number);              //method call//

    }
    public static boolean ispaalindrome(int number){

        int mainNUm = number;
        int reverse = 0;
        while(number!=0){
            int lastNum = number%10;
            reverse = (reverse*10)+lastNum;
            number/=10;
        }
        System.out.println(mainNUm ==reverse);
        return mainNUm == reverse;
    }
}



