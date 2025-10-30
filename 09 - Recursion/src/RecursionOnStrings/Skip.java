package RecursionOnStrings;

public class Skip {
    public static void main(String[] args) {
//        skipCharacter("", "wakiwaacnsa");
//
//        System.out.println(skip("bccakacba"));
//
//        System.out.println(skipString("dcbappleke"));

        System.out.println(skipAppNotApple("bcdapplejaj"));
        System.out.println(skipAppNotApple("bsappmwapplekdapp"));
    }

    public static void skipCharacter(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);
        if (ch == 'a') {
            skipCharacter(processed, unProcessed.substring(1));
        } else {
            skipCharacter(processed + ch, unProcessed.substring(1));
        }
    }

    public static String skip(String unProcessed) {
        if (unProcessed.isEmpty()) {
            return "";
        }

        char ch = unProcessed.charAt(0);
        if (ch == 'a') {
            return skip(unProcessed.substring(1));
        } else {
            return ch + skip(unProcessed.substring(1));
        }
    }

    public static String skipString(String unProcessed) {
        if (unProcessed.isEmpty()) {
            return "";
        }

        char ch = unProcessed.charAt(0);
        if (unProcessed.startsWith("apple")) {
            return skipString(unProcessed.substring(5));
        } else {
            return ch + skipString(unProcessed.substring(1));
        }
    }

    public static String skipAppNotApple(String unProcessed) {
        if (unProcessed.isEmpty()) {
            return "";
        }

        char ch = unProcessed.charAt(0);
        if (unProcessed.startsWith("app") && !unProcessed.startsWith("apple")) {
            return skipAppNotApple(unProcessed.substring(3));
        } else {
            return ch + skipAppNotApple(unProcessed.substring(1));
        }
    }
}
