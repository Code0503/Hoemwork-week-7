package meedWeekHomeWork;

import java.util.Scanner;

public class MW1 {
    //Take 10 integers from keyboard using loop and print their average value on the
    //screen.
    public static void main(String[] args) {
T();
    }
    public static void T(){
        Scanner a = new Scanner(System.in);
        double sum = 1;
        for (int i=1; i<=10; i++ ) {
            System.out.println("Input numbers upto 10 : ");
            sum = sum + a.nextInt();

          double avg = sum/10;
        }
        System.out.println("sum is "+ sum);
        System.out.println("Avg is : "+ sum/10);
    }
}
