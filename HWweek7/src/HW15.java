import java.util.Scanner;

public class HW15 {
    //Write a program that tells us input value is number or an alphabet orsymbol.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;     //Declare a char in variable
        System.out.println("Enter the character ");
        ch = sc.next().charAt(0);   //Initialize the character
        System.out.println("Enter the Number ");
        int i = Integer.parseInt(sc.next());
        //check whether alphabet or not using if-else statement

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.print(ch + " is an Alphabet, ");
        } else {
            System.out.print(ch + " is not an Alphabet ");
        }
        if (i >= 0 && i <= 100) {
            System.out.print(i + " is a Number, ");
        } else {
            System.out.print(i + " is not Number ");
        }
    }}






