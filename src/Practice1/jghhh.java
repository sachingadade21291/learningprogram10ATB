package Practice1;

public class jghhh {
    public static void main(String[] args) {
        String hj="I am good";
      String rev="";
        String[] srt=hj.split(" ");
       for(int i=srt.length-1;i>=0;i--)
       {
         rev=rev+" "+srt[i];
       }
        System.out.println(rev);

    }
}
