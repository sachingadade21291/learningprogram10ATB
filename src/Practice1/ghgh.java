package Practice1;

import java.util.Scanner;

public class ghgh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int ss=sc.nextInt();
        int count=0;
        while(ss>0){
            ss=ss/10;
            count++;
        }
        System.out.println(count);
    }
}
