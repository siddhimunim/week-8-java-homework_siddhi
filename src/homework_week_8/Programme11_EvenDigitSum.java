package homework_week_8;

import java.util.Scanner;

/*Write a method named getEvenDigitSum with one parameter of type int called number.
        The method should return the sum of the even digits within the number.
        If the number is negative, the method should return -1 to indicate an invalid value.
        EXAMPLE INPUT/OUTPUT:
        * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
        * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
        * getEvenDigitSum(-22); → should return -1 since the number is negative*/
public class Programme11_EvenDigitSum {
    public static void main(String[] args) {
        //scanner declaration to read input from console//
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = in.nextInt();
        System.out.println("Even digit sum  = " + getEvenDigitSum(number));
        in.close();
    }

    public static int getEvenDigitSum(int number) {

        int sum = 0;
        if (number<0)
            return-1;
        while (number>0){
            int eveNum = number%10;
            if(eveNum%2 ==0)
                sum += eveNum;
            number/=10;
        }

        return  sum;
    }
}


