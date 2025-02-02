package Practice1;

import java.util.Scanner;

public class Eligibility_for_loan {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter the salary");

        int salary = scanner.nextInt();
        System.out.println("Enter the credit score");
        int creditscore = scanner.nextInt();
        if (age > 0 && salary > 0 && creditscore > 0) {
            if (age >= 18 && age <= 80 && salary >= 30000 && creditscore >= 650 && creditscore <= 850) {
                System.out.println("The person is eligible for loan");
            } else if ((age <= 17 || age >= 81) && salary >= 30000 &&( creditscore >= 650 && creditscore <= 850)) {
                System.out.println("Age is not eligible");
            } else if ((age >= 18 && age <= 80) && salary <= 29999 && (creditscore >= 650 && creditscore <= 850)) {
                System.out.println("Salary is not eligible");

            } else if ((age >= 18 && age <= 80) && salary >= 30000 && (creditscore <= 649 || creditscore >= 851)) {
                System.out.println("Credit score is not within limit hence unable to eligible for loan");
            } else if ((age<=17 || age>=81) && salary<=29999 && (creditscore<=649 || creditscore>=851)) {
                System.out.println("Age,Salary and Creditscore are not eligible");


            } else if ((age<=17 || age>=81 )&& salary<=29999  ) {
                System.out.println("Age and salary are not in specified limit");
            } else if (salary<=29999 && (creditscore<=649 || creditscore>=851)) {
                System.out.println("Salary and creditscore are not within specified limit");
            } else if ((age<=17 || age>=81 && creditscore<=649 || creditscore>=851)) {
                System.out.println("Age and creditscore are not within specified limit");

            }
        } else {
            System.out.println("Please enter valid data");
        }

    }
}