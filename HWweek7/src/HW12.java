import java.util.Scanner;

public class HW12 {
    //Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
    //other alphabet should be invalid entry.
    public static void main(String[] args) {
cities();
    }

    public static void cities(){
        Scanner N = new Scanner(System.in);
        System.out.println("Enter any characters between A to F :");
        char city = N.next().charAt(0);


     switch (city){
            case 'A':
                System.out.println("Delhi");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Ahmedabad");
                break;
            case 'D':
                System.out.println("Pune");
                break;
            case 'E':
                System.out.println("Baroda");
                break;
            case 'F':
                System.out.println("Indore");
N.next();
                }
        boolean b = 'Z' >= 'G';
        if(b) {System.out.println(" ");}
        else {System.out.println("invalid alphabet");
            System.out.println("Please re-enter alphabet");}

        cities();

        }}



