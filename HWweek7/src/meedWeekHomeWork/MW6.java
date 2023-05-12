package meedWeekHomeWork;

import java.util.Scanner;

public class MW6 {
    //school has rules for grading system:

    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter Total marks to see grade: ");
        int i;
        i = h.nextInt();
        if (i >= 80) {
            System.out.println("Grade 'A'");
        } else if (i < 80 && i >= 60) {
            System.out.println("Grade 'B'");
        } else if (i < 60 && i >= 50) {
            System.out.println("Grade 'C'");
        } else if (i < 50 && i >= 45) {
            System.out.println("Grade 'D'");
        } else if (i < 45 && i > 25) {
            System.out.println("Grade 'E'");
        } else if (i <= 25) {
            System.out.println("Grade 'F'");
        }

    }}