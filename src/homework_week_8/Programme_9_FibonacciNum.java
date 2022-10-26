package homework_week_8;

import java.util.Scanner;

/*Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
* up to 100*/
public class Programme_9_FibonacciNum {
    public static void main(String[] args) {
     fibonacciMethod();
    }
    public static void fibonacciMethod(){
        //scanner declaration to read input from console//

        int sum =0;
        int num1 = 0;
        int num2 =1;
        System.out.println("Fibonacci series ");

        for (int i = 0;i <=100 ;i++ ){
            num1=num2;
            num2=sum;
            sum =num1+num2;
            System.out.println(sum + " ");
        }
    }
}
