import java.util.Arrays;

public class HW22 {
    //Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        average();
    }
    public static void average(){
        double [] a ={2,3,4,5,6,7,8,9,};
        System.out.println("Average value of arrays is ="+ Arrays.stream(a).sum()/5);
    }
}
