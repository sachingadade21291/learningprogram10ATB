public class GGHGH {
    public static void main(String[] args){
        int no=145;
        int t1=no;
        int t2=t1;
        int count=0;
        int sum=0;

        while(no>0){
            no=no/10;
            count++;
        }
        System.out.println(count);
        for(int i=1;i<=count;i++){
            int ui=t1%10;
            int n=ui*ui*ui;
            t1=t1/10;


            sum=sum+n;

        }
        System.out.println(sum);
        if(sum==t2){
            System.out.println("armstrong no");
        }
        else {
            System.out.println("armstrong no not");
        }

    }

}
