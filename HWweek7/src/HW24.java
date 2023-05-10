import java.util.Scanner;

public class HW24 {
    //Write java program using for loop and print surname 9 times.
    public static void main(String[] args) {
        j();
    }
    public static void j(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Surname here: ");
        String surname= s.next();

        for (int i=0; i<=8; i++){
            System.out.println(surname);}
    }
}
