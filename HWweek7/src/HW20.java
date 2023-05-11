import java.util.Arrays;

public class HW20 {
    //Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {


    int[] a ={56,88,99,90,67};

    String[] b ={"python","postman","selenium","java"};

    //System.out.println("original numeric array:" +Arrays.toString(a));
        Arrays.sort(a);

        System.out.println("Sorted numeric array :"  + Arrays.toString(a));

    //System.out.println("original String array:" +Arrays.toString(b));
        Arrays.sort(b);

        System.out.println("Sorted numeric array :"  + Arrays.toString(b));

}}

