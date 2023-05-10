import java.util.Scanner;

public class HW11 { // Calling citites using if elase statment
    public static void main(String[] args) {
Cities();
    }
    public static void Cities(){
        Scanner N= new Scanner(System.in);

        System.out.println("Enter any characters between A to F :");
        String letter = N.next();
        if(letter.equalsIgnoreCase("a")){
            System.out.println("Ahmedabad ");
        } else if (letter.equalsIgnoreCase("b")){
            System.out.println("Baroda");}
        else if (letter.equalsIgnoreCase("c")){
            System.out.println("Chenni");
        }else if (letter.equalsIgnoreCase("D")){
            System.out.println("Delhi");}
        else if (letter.equalsIgnoreCase("E")){
            System.out.println("Indore");}
        else if(letter.equalsIgnoreCase("F")){
            System.out.println("London");
        }

        Cities();
    }
}
