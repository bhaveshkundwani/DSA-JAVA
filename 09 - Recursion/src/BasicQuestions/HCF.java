package BasicQuestions;

public class HCF {
    public static void main(String[] args) {
        int a = 24;
        int b = 60;

        System.out.println(hcf(a, b));
    }

    public static int hcf(int a, int b){
        if (a == 0) return b;
        return hcf(b % a, a);
    }
}
