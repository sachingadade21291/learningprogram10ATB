package Practice1;

import java.util.Scanner;

public class Bonsus_structure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary");
        int salary=sc.nextInt();
        System.out.println("Enter years of experince");
        double exp=sc.nextDouble();
        if(salary>0 && exp >0){
            if (exp>0 && exp<1){
                System.out.println("There will be no bonus");
            } else if (exp>=1 && exp<4) {
                double bonus= 0.05*salary;
                System.out.println("The bonus amount is "+bonus);
            } else if (exp>=4 && exp<=6) {
                double bonus= 0.10*salary;
                System.out.println("The bonus amount is "+bonus);
            } else if (exp>6) {
                double bonus= 0.15*salary;
                System.out.println("The bonus amount is "+bonus);
            }
        }
        else {
            System.out.println("Enter valid salary or valid years of experince");
        }
    }
}
