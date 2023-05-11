import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {
        salary();
    }


    public static void salary(){
        double basicSalary,HRA,DA,PF,TA,Gross;
        Scanner employee = new Scanner(System.in);
        System.out.print("Employer ID is  :");
      int id = employee.nextInt();


        if ( id<10000) {
            System.out.println("Valid");
        } else {
            System.out.println("invalid entry");
            employee.next();
        }


        System.out.print("Employee Name    :");
        String name;
        while (employee.hasNext()) {
            System.out.println("Invalid Entry");
            System.out.println("Enter the name again :");
            employee.next();
        }
employee.next();

        System.out.print("Basic salary");
        basicSalary = employee.nextDouble();

        HRA=(basicSalary*10)/100;
        DA = (basicSalary*8)/100;
        TA = (basicSalary*9)/100;
        PF=  (basicSalary*20)/100;
        Gross = basicSalary+TA+HRA+DA-PF;
        System.out.println("|-------------------------|");
        System.out.println("|      Salary Slip        |");
        System.out.println("|-------------------------|");
        System.out.println("| Employee Id   : "+id+" |");
        System.out.println("| Employee Name : "+employee+" |");
        System.out.println("|------------------------- |");
        System.out.println("| Basic Salary  : "+basicSalary+" |");
        System.out.println("| HRA 10%       : "+HRA+" |");
        System.out.println("| TA 8%         : "+TA+" |");
        System.out.println("| DA 9%         : "+DA+" |");
        System.out.println("| PF - 20%      : "+PF+" |");
        System.out.println("|-------------------------| ");
        System.out.println("| Gross Salary  : "+Gross+" |");
        System.out.println("|=========================|");



    }
}
