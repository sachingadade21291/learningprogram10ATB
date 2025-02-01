package Practice1;

import java.util.Scanner;

public class teeneryoperator_lea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int year=sc.nextInt();

        String Leap_year=year%4==0 &&year%100==0  && year%400==0?"The enter year is leap year":(year%4==0&& year%100!=0 && year%400!=0?"The year is leap year":"The year is not leap year");
        System.out.println(Leap_year);
    }


}
