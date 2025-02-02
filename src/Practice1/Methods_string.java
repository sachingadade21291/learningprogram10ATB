package Practice1;

public class Methods_string {
    public static void main(String[] args){
        String name="Sachin";
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.substring(1,3));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("Sa"));
        System.out.println(name.contains("sa"));
        System.out.println(name.concat(" Gadade"));
        System.out.println(name.equals("Sachin"));
        System.out.println(name.endsWith("in"));
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.indexOf('h'));
        System.out.println(name.indexOf("chi"));
        System.out.println(name.replace("n","k"));
        String name1="Sachin@hhj";
        System.out.println(name1.split("@"));

    }

}
