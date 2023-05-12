package meedWeekHomeWork;

import java.util.Scanner;

public class MW9 {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter the number of classes attended");
        double a = A.nextInt();
        System.out.println("Enter the number of classes held : ");
        double b=A.nextInt();

        System.out.println("if she/he have any medical cause Y or N");
        boolean medical = A.nextBoolean();

        if(a/b*100 >75 ) {
            System.out.println("She/He allowed to sit in exam with "+a/b*100 +" Percentage of attendence");
        }  if (medical) {
            System.out.println("You are allowed to sit in exam with "+a/b*100 +" Percentage of attendence");
        }
        else {
            System.out.println("She/He not allowed to sit in exam with "+ a/b*100 + " Percentage of attendance");
        }

    }
}


