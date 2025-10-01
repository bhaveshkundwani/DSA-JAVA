package strings;

// sum of all substrings of a number
public class Sum {
    public static void main(String[] args) {
        String str = "6759";
        int ans = sumSubstrings(str);
        System.out.println(ans);
    }

    public static int sumSubstrings(String s) {
        // code here
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                String temp = s.substring(i, j + 1);
                int c = Integer.parseInt(temp);
                sum += c;
            }
        }

        return sum;
    }
}
