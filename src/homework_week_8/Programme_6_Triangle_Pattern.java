package homework_week_8;
/*Write a program in Java to display the pattern like a triangle with a number.
        For eg.
        Input number of rows: 10
        Expected Output:
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910*/

import java.util.Scanner;

public class Programme_6_Triangle_Pattern {
    public static void triangle(){
        //scanner declaration to read input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of row");
       int num = scanner.nextInt();  //create scanner//
       String x = "";
       for (int i = 1 ; i<=num; i++ ){
         x +=i;
           System.out.println(x);
       }
       scanner.close();
    }

    public static void main(String[] args)
    {
        triangle();       //call method//
    }

}
