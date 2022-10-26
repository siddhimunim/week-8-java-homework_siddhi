package homework_week_8;
/*Read 10 numbers from the console entered by the user and print the sum of those
        numbers.
        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
        -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
        10 numbers.
        -Use the nextInt() method to get the number and add it to the sum.
        -Before the user enters each number, print the message Enter number #x: where x represents the
        count, i.e. 1, 2, 3, 4, etc.
        -For example, the first message printed to the user would be Enter number #1:, the next Enter number */
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
       hasNextMethod();
    }
    public static void hasNextMethod(){
        //declare scanner to read input from console//
        Scanner scanner = new Scanner((System.in));


        int calculate =1;
        int add =0;
        while (calculate<=10){
            System.out.println("Enter number : " + calculate

            );
            boolean num = scanner.hasNextInt();
            if (num){
                int number =scanner.nextInt();
                add+=number;
                calculate++;
            } else{
                System.out.println("Invalid Number");
            }
            //always returns new user input//1

            scanner.nextLine();
        }
        System.out.println("Add of all Numbers = " + add);
       scanner.close();
    }
}
