package string_builder;

public class ReverseStringBuilder {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Bhavesh");
//        sb.reverse();

//        int i = 0, j = sb.length() - 1;
//
//        while (i <= j){
//            char temp = sb.charAt(i);
//            sb.setCharAt(i, sb.charAt(j));
//            sb.setCharAt(j, temp);
//            i++;
//            j--;
//        }
//
//        System.out.println(sb);

        String s = "Number";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);
    }
}
