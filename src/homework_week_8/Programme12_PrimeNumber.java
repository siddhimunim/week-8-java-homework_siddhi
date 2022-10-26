package homework_week_8;
/*(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
        prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
        17.... are the prime numbers.*/
import java.util.Scanner;

public class Programme12_PrimeNumber {
    public static void main(String[] args) {
        //scanner declaration to read input from console//
        Scanner in =new Scanner(System.in);
        System.out.println("Enter any value:");
        int num = in.nextInt();
        primeMethod(num);    //call method to main method//
    }
    public static void primeMethod(int num){

        int count = 0;
        if(num>1){
            for(int i =1;i<=num;i++){
                if(num%i ==0)
                    count++;
            }if (count==2){
                System.out.println("It is prime Number");
            }else{
                System.out.println("It is not prime number");
            }
        }else{
            System.out.println("Invalid number");
        }
    }
}
