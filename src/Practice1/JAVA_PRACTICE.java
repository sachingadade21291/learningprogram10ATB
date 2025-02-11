package Practice1;

public class JAVA_PRACTICE {
    public static void main(String[] args){
        String name= "Sonal";
        System.out.println(name.substring(1,3));
        System.out.println(name.indexOf("on"));
        System.out.println(name.replace('o','k'));
        System.out.println(name.indexOf("al"));
        System.out.println(name.indexOf('a'));
        System.out.println(name.concat(" Gadade"));
        System.out.println(name.contains("So"));
        StringBuilder stringBuilder=new StringBuilder("Sachin");
        stringBuilder.append(" Gadade");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        StringBuffer stringBuffer=new StringBuffer("Sachin");
        stringBuffer.append(" Gadade");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


    }
}
