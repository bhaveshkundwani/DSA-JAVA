package string_builder;

public class StringBuilders {
    public static void main(String[] args) {
//        by default the capacity of StringBuilder is 16

//        StringBuilder sb = new StringBuilder("Bhavesh ");

//        StringBuilder sb = new StringBuilder(6);
//        System.out.println(sb.length() + " " + sb.capacity());
//        System.out.println(sb);
//        sb.append("Kundwani");
//        System.out.println(sb.length() + " " + sb.capacity());
//        System.out.println(sb);
//
//        sb.setCharAt(4, 'n');
//        System.out.println(sb);
//
//        String s = sb.toString();
//        System.out.println(s);

        StringBuilder sb = new StringBuilder("Bhavesh");
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1, 'h');
        System.out.println(sb);
        sb.delete(3, 8);
        System.out.println(sb);


    }
}
