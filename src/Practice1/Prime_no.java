package Practice1;

import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int j=sc.nextInt();
        if (j%1==0 && j%j==0){
            System.out.println("The given no is prime no");
        }
        else{
            System.out.println("The given no is not prime");
        }


    }
}
