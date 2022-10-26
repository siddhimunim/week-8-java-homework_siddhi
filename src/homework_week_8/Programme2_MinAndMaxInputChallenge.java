package homework_week_8;
/*-Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.*/
import java.util.Scanner;


public class Programme2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
      //  Scanner scanner =new Scanner(System.in);
      //  System.out.println("Enter Number :");
       // int num = scanner.nextInt();
        numMethod();
    }

    public static void numMethod(){
        //scanner declaration to read input from console//
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Number : " );

        int num = scanner.nextInt();

        int max = num;          // min equals to max no//
        int min = num;
        while(num!= 0){
            if ( num > max){
                max =num;
            }else if (num<min){
                min =num;
            }
             System.out.print("Enter Number : ");
            num = scanner.nextInt();                // scanner for continues num display//
        }
        if (max!= 0 && min != 0){
            System.out.println("max no is " + max);
            System.out.println("min no is " + min);
        }
        }

    }


