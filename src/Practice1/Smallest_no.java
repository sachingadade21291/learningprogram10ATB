package Practice1;

import java.util.Scanner;

public class Smallest_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter n1");
        int n1=sc.nextInt();
        System.out.println("Please enter N2");
        int n2=sc.nextInt();
        if (n1>n2){

            System.out.println("The Enter no is smallest no"+ n2);
        }
        else{
            System.out.println("The enter ni is largwst"+ n2);

        }


    }

}
