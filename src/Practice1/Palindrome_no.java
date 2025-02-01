package Practice1;

import java.util.Scanner;

public class Palindrome_no {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter No");
        int number= scanner.nextInt();
        String n1=Integer.toString(number);
        String rev_no="";
        for(int i=n1.length()-1;i>=0;i--){
            char r=n1.charAt(i);
            rev_no=rev_no+r;
        }
        if (n1.equals(rev_no))
        {
            System.out.println("The no is palindrome");
        }
        else{
            System.out.println("The no is not palindrome");
        }




    }
}
