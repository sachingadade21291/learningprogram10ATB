package Practice1;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList a1=new LinkedList<>();
        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(400);
        LinkedList a2=new LinkedList<>(a1);
        a2.addAll(4,a1);
        System.out.println(a1);
        System.out.println(a2);
        a2.set(5,100);
        System.out.println(a2);
        a1.remove(1);
        System.out.println(a1);
        a1.push(1200);
        System.out.println(a1);

        System.out.println(a2);

    }
}
