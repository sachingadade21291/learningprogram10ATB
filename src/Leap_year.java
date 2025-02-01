import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        if(year>0) {
            if (year % 4 == 0  && year%400==0) {
                System.out.println("Year is Leal Year");

            }
            else if(year%4==0 && year%400!=0){
                System.out.println("The enter year is leap year");

            }

            else{
                System.out.println("Year is not leap year");
            }
        }
        else{

            System.out.println("Invalid year");
        }
    }

}
