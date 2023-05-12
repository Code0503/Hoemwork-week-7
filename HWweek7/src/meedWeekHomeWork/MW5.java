package meedWeekHomeWork;

import java.util.Scanner;

public class MW5 {//Take two int values from user and print greatest among them.

    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Enter two diffrent numbers to see greatest among them: ");
        int a,b;
        a= g.nextInt();
        b= g.nextInt();
        if(a>b){
            System.out.println("Greates among them is : "+a );
        }else {
            System.out.println("Greates among them is : "+b);
    }
}}
