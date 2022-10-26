package homework_week_8;

import java.util.Locale;
import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant*/
public class Programme_3_Vowel {
    public static void main(String[] args) {
        charMethod();                   // call method to main method//
    }

    public static void charMethod() {
        //scanner declaration to read input from console//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an Alphabet :");
        String letter = scanner.next();
      if(letter.length()== 1  &&  Character.isAlphabetic(letter.charAt(0))){
          char ch = Character.toLowerCase(letter.charAt(0));

            if (ch == 'a' || ch == 'e' ||ch == 'e'|| ch == 'o' ||ch == 'u') {
                System.out.println("It is Vowel");
            } else if (letter.length() > 1) {
                System.out.println("Input Error");

            } else {
                System.out.println("It is Consonant");
            }

        } else {
            System.out.println("Invalid Input");
        }

    }
}
