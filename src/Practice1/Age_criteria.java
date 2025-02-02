package Practice1;

import java.util.Scanner;

public class Age_criteria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age>0 && age<=12){
            System.out.println("Person is child");
        }
        else if(age >=13 && age<=19){
            System.out.println("Person is teenager");
        }
        else if(age>=20 && age<=64){
            System.out.println("person is an adult");

        } else if (age>=65) {
            System.out.println("Person is senior citizen");
        }
    }
}
