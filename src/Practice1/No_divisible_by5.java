package Practice1;

import java.util.Scanner;

public class No_divisible_by5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int number=sc.nextInt();
        if(number%5==0 & number%11==0){
            System.out.println("The given no is divisible by 5&11");
        }
        else if (number%5==0 && number%11!=0){
            System.out.println("The no is only divisible by 5");
        }
        else if (number%5!=0 && number%11==0){
            System.out.println("The no is only divisible by 11");
        }
        else{
            System.out.println("The given no is not divisible by 5&11");
        }
    }
}
