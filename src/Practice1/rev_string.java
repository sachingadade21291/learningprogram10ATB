package Practice1;

public class rev_string {
    public static void main(String[] args) {
        String sd="racecar";
        String rev="";
        for(int i=sd.length()-1;i>=0;i--){
            char r=sd.charAt(i);
            rev=rev+r;
        }
        if(sd.equals(rev)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
