public class HW14 {/*Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately.*/

    public static void main(String[] args) {
        int a;
        System.out.println("Numbers divided by 3 = ");
        for ( a = 0; a <= 100; a++) ;
        {
            if (a % 3 == 0) {
                System.out.println(a);
            }
            {
                System.out.println("Numbers divided by 5 = ");
                for(a = 0; a <= 100; a++)
                    if(a%5==0){
                        System.out.println(a);
                }

        }
    }
}}