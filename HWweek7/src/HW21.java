import java.util.Arrays;

public class HW21{
// Write a Java program to sum values of an array.
public static void main(String[] args) {


    int[] a = {2,3,4,5,6,7,8,9};
    System.out.println("sum of arrays = "+ Arrays.stream(a).sum());
}
}
