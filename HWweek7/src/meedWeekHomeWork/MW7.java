package meedWeekHomeWork;

import java.util.Scanner;

public class MW7 {
    //Take input of age of 3 people by user and determine oldest and youngest among
    //them.
    public static void main(String[] args) {
         Scanner age=new Scanner(System.in);

        System.out.println("Enter age of person 1: ");
        int age1 =age.nextInt();
        System.out.println("Enter age of person 2: ");
        int age2=age.nextInt();
        System.out.println("Enter age of person 3: ");
        int age3=age.nextInt();
        if(age1<age2 && age1<age3)
            System.out.print("The Youngest Age is person 1");
        else if(age2<age1 && age2<age3)
            System.out.print("The Youngest Age is person 2");
        else
            System.out.print("The Youngest Age is person 3");


    }
}
