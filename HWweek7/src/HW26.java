public class HW26 {
    //Write a Java program to reverse a word.
    //Sample Output:
    //Input a word: dsaf
    //Reverse word: fasd

    public static void main(String[] args) {
        String word ="dsaf", rev="";
        char wo;
        System.out.println("Input word: dsaf");


        for (int i=0; i<word.length(); i++){
            wo=word.charAt(i); // extract each letter
            rev=wo+rev; // add each letter infront of the existing letters
        }
        System.out.println("Reverse word: "+rev);
}}
