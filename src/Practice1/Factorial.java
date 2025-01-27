package Practice1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){

         Scanner sc=new Scanner(System.in);
         int fact=1;
        System.out.println("Enter a number");
         int i=sc.nextInt();

         if(i<0) {
             System.out.println("Enter valid data");
         }
         else if(i==0){
             System.out.println("1");
         }
           else {
             while (i >= 1) {

                 fact = i * fact;
                 i--;
             }
             System.out.println(fact);
         }
    }
}
