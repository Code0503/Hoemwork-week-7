import java.util.Scanner;

public class HW8 {
    //Write a java program to get numbers from users and print whether it is positive or negative.
    public static void main(String[] args) {
N1();
N2();
N3();
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


    }
public static void N2(){
        Scanner B = new Scanner (System.in);
        int Number;
    System.out.println("Enter diffrent number then above:");
    Number = B.nextInt();
    if(Number < 0 ){
        System.out.println("The number entered is negative. ");
    } else if (Number>0){
        System.out.println("The number entered is positive.");}
    else{
        System.out.println("The number entered is equals to zero.");
    }

}
public static void N3(){
        Scanner C = new Scanner(System.in);
        int Numbers;
    System.out.println("Enter anouther number");
        Numbers = C.nextInt();
        if (Numbers >0){
            System.out.println("The number entered is positive.");}
        else if(Numbers < 0){
            System.out.println("The number entered is negative.");}
        else{
            System.out.println("The number entered is equals to zero.");
        }
}






}
