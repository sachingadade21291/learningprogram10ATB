package Practice1;

import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the no");
        int days=scanner.nextInt();
        int years=days/365;
        int months=days%365;
        int month=months/30;
        int day=months%30;
        System.out.println("Years " + years);
        System.out.println("Months"+ month);
        System.out.println("days" + day);

    }
}
