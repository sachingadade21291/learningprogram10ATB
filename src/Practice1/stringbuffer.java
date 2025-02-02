package Practice1;

public class stringbuffer {
    public static void main(String[] args){

        StringBuilder stringBuilder=new StringBuilder("Sachin");
        stringBuilder.append(" gadade");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        StringBuffer stringBuffer=new StringBuffer("Sachin");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.replace(2,5,"df"));
    }
}
