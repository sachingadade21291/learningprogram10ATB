package Practice1;

public class hgghhh {
    public static void main(String[] args) {
        String name="I am good";
        String rev="";
        String[] r=name.split(" ");
        for(int i=r.length-1;i>=0;i--){
            rev=rev+r[i]+" ";
        }
        System.out.println(rev);
    }
}
