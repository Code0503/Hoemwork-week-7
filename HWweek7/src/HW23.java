import java.util.Scanner;

public class HW23 {
    //Write java program using for loop and print your name 10 times.
    public static void main(String[] args) {
n();
    }
    public static void n(){
        Scanner m = new Scanner(System.in);
        System.out.println("Enter a name: ");
         String name = m.next();
        for (int i=0; i<=10; i++){
        System.out.println(name);}
    }
}
