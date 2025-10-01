package strings;

public class PassingToMethods {
    public static void main(String[] args) {
        String name = "Bhavesh";
        System.out.println(name);
        change(name);
        System.out.println(name);
    }

    public static void change(String s){
        s = "Raghav";
    }
}
