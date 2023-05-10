import java.util.Scanner;

public class HW13 { /*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
    find addition, Subtraction, multiplication and division according to theirsymbol(using if else)
*/

    public static void main(String[] args) {
calci();
    }

    public static void calci(){
        Scanner B = new Scanner(System.in);
      double  a;
        double b;
        System.out.println("Enter Two Numbers: ");
        a =B.nextInt();
        b= B.nextInt();
        System.out.println("Enter symbol");
        String symbol =B.next();
        if(symbol.equals("+")){
            System.out.println("addition = "+(a+b));
    }else if (symbol.equals("-")){
            System.out.println("substract = "+(a-b));}
        else if (symbol.equals("/")){
            System.out.println("divison ="+(a/b));}
        else if(symbol.equals("*")){
            System.out.println("Multiply = "+(a*b));
        }

    }









}
