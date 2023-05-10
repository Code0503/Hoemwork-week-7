import java.util.Scanner;

public class HW19 {
    public static void main(String[] args) {
        N1();
    }
    public static void N1(){
        Scanner A = new Scanner(System.in);
        int number;
        System.out.println("Entered number: ");

        number = A.nextInt();

        if(number < 0 ){
            System.out.println("The number entered is negative. ");
        } else if (number>0){
            System.out.println("The number entered is positive.");}
        else{
            System.out.println("The number entered is equals to zero.");
        }
N1();

    }

    }







