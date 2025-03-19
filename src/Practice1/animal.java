package Practice1;

import org.w3c.dom.ls.LSOutput;

public abstract class animal {
    public abstract void run();
    public abstract void walk();
    public abstract void sound();

}

class dog extends animal{
    public static void main(String[] args) {
        dog r=new dog();
        r.sound();
        r.walk();
        r.run();

        lion l=new lion();
        l.walk();
        l.sound();
        l.run();
    }

        public void run ()
    {
            System.out.println("The dog is abrking");
    }
        public void walk ()
    {
            System.out.println("The dog is walking smoothly");
        }
        public void sound ()
    {
            System.out.println("ghhh");
        }

    }
    class lion extends animal{
        @Override
        public void run() {
            System.out.println("Lion is runninh");
        }

        @Override
        public void sound() {
            System.out.println("roaring");
        }

        @Override
        public void walk() {
            System.out.println("ghhggh");
        }

    }



