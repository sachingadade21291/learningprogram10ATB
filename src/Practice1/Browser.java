package Practice1;


import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        System.out.println("enter url");
        String website=sc.nextLine();


            if (website.endsWith(".com")) {
                System.out.println("The website is:commercial");
            } else if (website.endsWith(".org")) {
                System.out.println("The website is:non profit organization");
            } else if (website.endsWith(".edu")) {
                System.out.println("The website is educative");
            } else if (website.endsWith(".gov")) {
                System.out.println("The website is goverment organization");
            } else if (website.endsWith(".net")) {
                System.out.println("This is network related ");
            } else if (website.endsWith(".info")) {
                System.out.println("This is informative");
            } else {
                System.out.println("The website is unknown");
            }
    }
    }

