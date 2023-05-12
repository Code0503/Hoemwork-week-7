package meedWeekHomeWork;

import java.util.Scanner;

public class MW4 {
    /*Take values of length and breadth of a rectangle from user and check
    if it is square or not.
     */
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        System.out.print("Enter The Length  :");
        double len = T.nextDouble();
        System.out.print("Enter The Breadth :");
        double bre = T.nextDouble();
        double area = len * bre;
       double perimeter = 4 * (len+bre);
        System.out.println("Area of Rectangle : "+ area);
        System.out.println("Perimeter of Rectangle : "+ perimeter);
        if(area>perimeter)
        {
            System.out.println("Area of rectangle is greater than  Perimeter");
        }
        else
        {
            System.out.println("Perimeter of rectangle is greater than Area");
        }
    }
}
