package Practice1;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector A1=new java.util.Vector<>();
        A1.add(100);
        A1.add(50);
        A1.add(200);
        System.out.println(A1.capacity());
        java.util.Vector a2=new java.util.Vector();
        a2.add(199);
        System.out.println(a2.size());
        System.out.println(a2.capacity());
        System.out.println(A1.getLast());
    }
}
