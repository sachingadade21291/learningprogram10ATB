package Practice1;

import java.util.Scanner;

public class Smallest_no_three {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("The enter n1");
        int n1=sc.nextInt();
        System.out.println("The enter n2");
        int n2=sc.nextInt();
        System.out.println("The The entre n3");
        int n3=sc.nextInt();
        if(n1>n2 && n3>n2){
            System.out.println("The smallest no is" +n2);
        }
        else if(n1>n3 && n2>n3){
            System.out.println("The enter no is smallest"+n3);

        }
        else if(n2>n1 && n3>n1){
            System.out.println("The enter no smallest" +n1);
        }



    }

}
