package Practice1;

import java.util.Scanner;

public class Java_origram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter unit used");
        int unit=sc.nextInt();
        if(unit>0){
            if(unit>0 && unit<=100){
                double bill=unit*0.50;
                System.out.println("The bill will be " +bill);
            } else if (unit>100 && unit<=200) {
                double bill=unit*0.75;
                System.out.println("The bill will be " +bill);
            } else if (unit>200 && unit<=300) {
                double bill=unit*1.20;
                System.out.println("The bill will be " +bill);
            } else if (unit>300) {
                double bill=unit*1.50;
                System.out.println("The bill will be " +bill);
            }
        }
        else{
            System.out.println("Enter valid unit");
        }
    }
}
