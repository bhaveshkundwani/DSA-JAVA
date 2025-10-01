package strings;

public class Conversion {
    public static void main(String[] args) {
//        integer to string conversion
        int n = 2932;
//        String s = ""  + n;
//        System.out.println(s.length());
        String s = Integer.toString(n);
        System.out.println(s.length());

//        string to integer conversion
        String s1 = "293092";
        int n1 = Integer.parseInt(s1);
        System.out.println(n1 + 10);
    }
}
