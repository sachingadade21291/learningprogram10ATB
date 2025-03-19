package Practice1;

public class Abstract1 extends Abstract{
    public static void main(String[] args) {
        Abstract1 ref=new Abstract1();
        ref.walk();
        ref.talk();
    }
    public void run(){
        System.out.println("we can run" );
    }
    public void talk(){
        System.out.println("we can talk");
    }

}
