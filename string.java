import java.util.*;

public class string {

    public static void main(String[] args) {
        // String name = new String("shamim");
        // System.out.println(name);
        // Scanner sc = new Scanner(System.in);
        // String st = sc.nextLine();
        // System.out.println(st);
        String name = "Shamim";
        int value = name.length();
        System.out.println(value);
        System.out.println(name.substring(0,4));
        System.out.println(name.replace('m','k'));
        System.out.println(name.endsWith("im"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("m"));
        System.out.println(name.equals("Shamim"));

        String Lstr = name.toLowerCase();
        System.out.println(Lstr);

        String Ustr = name.toUpperCase();
        System.out.println(Ustr);

        

    }
}
