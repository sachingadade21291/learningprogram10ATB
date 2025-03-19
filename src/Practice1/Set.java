package Practice1;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Set {
    public static void main(String[] args) {
        ArrayList r=new ArrayList();
        r.add(100);
        r.add(1,200);
        r.addLast(300);
        r.addFirst("Sachin" );
        System.out.println(r);
        r.remove(2);
        r.remove("Sachin");
        System.out.println(r.contains(100));
        System.out.println(r.get(1));
        r.set(1,800);
        System.out.println();

        Iterator itr=r.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }





    }
}
