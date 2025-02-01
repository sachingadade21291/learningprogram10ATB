package Practice1;

import java.util.Scanner;

public class Largest_no_three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1");
        int n1=sc.nextInt();
        System.out.println("Enter n2");
        int n2=sc.nextInt();
        System.out.println("Enter n3");
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("The largest no"+n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("The enter no is largest"+n2);

        }
        else if(n3>n1 && n3>n2){

            System.out.println("The enter no is larget"+n3);
        }

        }
    }

