package meedWeekHomeWork;

import java.util.Scanner;

public class MW8 {

    /* A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.  */
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter the number of classes attended");
        double a = A.nextInt();
        System.out.println("Enter the number of classes held : ");
        double b=A.nextInt();
        if(a/b*100 >75 ) {
            System.out.println("She/He allowed to sit in exam with "+a/b*100 +" Percentage of attendence");
        }

        else {
            System.out.println("She/He not allowed to sit in exam with "+ a/b*100 + " Percentage of attendance");
        }

    }
}
